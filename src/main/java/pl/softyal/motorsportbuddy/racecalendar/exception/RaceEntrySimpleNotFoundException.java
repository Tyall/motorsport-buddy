package pl.softyal.motorsportbuddy.racecalendar.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RaceEntrySimpleNotFoundException extends RuntimeException {

    public RaceEntrySimpleNotFoundException(Integer season, Integer raceId) {
        super(String.format("Race with id %s cannot be found in season %s of schema %s", raceId, season, "formula_one"));
    }

}
