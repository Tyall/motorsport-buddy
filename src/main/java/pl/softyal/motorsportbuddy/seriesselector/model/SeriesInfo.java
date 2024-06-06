package pl.softyal.motorsportbuddy.seriesselector.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "series_info", schema = "app_common")
public class SeriesInfo {

    @Id
    private Integer id;

    private String codename;

    private String name;

    private String slogan;

    @Column(name = "logo_url")
    private String logoUrl;

}
