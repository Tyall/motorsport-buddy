package pl.softyal.motorsportbuddy.racecalendar.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.softyal.motorsportbuddy.racecalendar.exception.RaceEntrySimpleNotFoundException;
import pl.softyal.motorsportbuddy.racecalendar.model.RaceEntryId;
import pl.softyal.motorsportbuddy.racecalendar.model.RaceEntrySimple;
import pl.softyal.motorsportbuddy.racecalendar.model.response.RaceEntryDetailedResponse;
import pl.softyal.motorsportbuddy.racecalendar.repository.RaceEntrySessionRepository;
import pl.softyal.motorsportbuddy.racecalendar.repository.RaceEntrySimpleRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class RaceCalendarService {

    private final RaceEntrySimpleRepository raceEntrySimpleRepository;

    private final RaceEntrySessionRepository raceEntrySessionRepository;

    public List<RaceEntrySimple> getRaceEntrySimple(Integer season) {
        return raceEntrySimpleRepository.findByRaceIdSeasonOrderByRaceIdAsc(season);
    }

    public RaceEntrySimple getRaceEntry(Integer season, Integer raceId) throws RaceEntrySimpleNotFoundException {
        return raceEntrySimpleRepository.findById(new RaceEntryId(season, raceId))
                .orElseThrow(() -> new RaceEntrySimpleNotFoundException(season, raceId));
    }

    public List<RaceEntryDetailedResponse> getRaceEntryDetailed(Integer season, Integer raceId) {
        return new ArrayList<>();
    }
}
