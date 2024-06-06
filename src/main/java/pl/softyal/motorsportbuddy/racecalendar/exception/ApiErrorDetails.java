package pl.softyal.motorsportbuddy.racecalendar.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ApiErrorDetails {

    private Integer statusCode;
    private Date timestamp;
    private String message;
    private String description;

}
