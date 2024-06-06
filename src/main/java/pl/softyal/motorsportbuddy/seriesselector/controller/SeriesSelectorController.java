package pl.softyal.motorsportbuddy.seriesselector.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.softyal.motorsportbuddy.racecalendar.model.RaceEntrySimple;
import pl.softyal.motorsportbuddy.seriesselector.model.SeriesInfo;
import pl.softyal.motorsportbuddy.seriesselector.service.SeriesSelectorService;

import java.util.List;

@RestController
@RequestMapping("/series-selector")
public class SeriesSelectorController {

    @Autowired
    private SeriesSelectorService seriesSelectorService;

    @GetMapping("/configuration")
    public ResponseEntity<List<SeriesInfo>> getAvailableSeriesConfiguration() {
        return new ResponseEntity<>(seriesSelectorService.getAvailableSeriesConfiguration(), HttpStatus.OK);
    }

}
