package pl.softyal.motorsportbuddy.racecalendar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.softyal.motorsportbuddy.racecalendar.model.RaceEntrySimple;
import pl.softyal.motorsportbuddy.racecalendar.model.response.RaceEntryDetailedResponse;
import pl.softyal.motorsportbuddy.racecalendar.service.RaceCalendarService;

import java.util.List;

@RestController
@RequestMapping("/race-calendar")
public class RaceCalendarController {

    @Autowired
    private RaceCalendarService raceCalendarService;

    @GetMapping("/season/{season}")
    public ResponseEntity<List<RaceEntrySimple>> getRaceEntriesBySeason(@PathVariable("season") Integer season) {
        return new ResponseEntity<>(raceCalendarService.getRaceEntrySimple(season), HttpStatus.OK);
    }

    @GetMapping("/season/{season}/races/{raceId}")
    public ResponseEntity<RaceEntrySimple> getRaceEntryBySeasonAndId(@PathVariable("season") Integer season, @PathVariable("raceId") Integer raceId) {
        return new ResponseEntity<>(raceCalendarService.getRaceEntry(season, raceId), HttpStatus.OK);
    }

    @GetMapping("/season/{season}/races/{raceId}/details")
    public ResponseEntity<List<RaceEntryDetailedResponse>> getRaceEntryDetailsBySeasonAndId(@PathVariable("season") Integer season, @PathVariable("raceId") Integer raceId) {
        return new ResponseEntity<>(raceCalendarService.getRaceEntryDetailed(season, raceId), HttpStatus.OK);
    }

}
