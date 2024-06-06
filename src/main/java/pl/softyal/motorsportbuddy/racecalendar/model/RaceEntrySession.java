package pl.softyal.motorsportbuddy.racecalendar.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "race_entry_session", schema = "formula_one")
public class RaceEntrySession {

    @EmbeddedId
    private RaceEntryId raceId;

    @Column(name = "session_id")
    private Integer sessionId;

    private String type;
    private Date date;

}
