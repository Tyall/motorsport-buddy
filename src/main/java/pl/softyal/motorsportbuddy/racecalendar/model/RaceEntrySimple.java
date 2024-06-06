package pl.softyal.motorsportbuddy.racecalendar.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "race_entry_simple", schema = "formula_one")
/*TODO Implement Hibernate's multi-tendancy to dynamically chose schema based on given sport*/
public class RaceEntrySimple {

    @EmbeddedId
    private RaceEntryId raceId;

    private Date date;

    private String country;

    @Column(name = "country_iso_code")
    private String countryIsoCode;

    @Column(name = "event_name")
    private String eventName;

    @Column(name = "event_duration")
    private Integer eventDuration;

    @Column(name = "track_img_url")
    private String trackImgUrl;

}
