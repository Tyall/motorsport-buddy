package pl.softyal.motorsportbuddy.racecalendar.model.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.softyal.motorsportbuddy.racecalendar.model.RaceEntrySession;
import pl.softyal.motorsportbuddy.racecalendar.model.RaceEntrySimple;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class RaceEntryDetailedResponse extends RaceEntrySimple {

    private List<RaceEntrySession> raceSession;

}
