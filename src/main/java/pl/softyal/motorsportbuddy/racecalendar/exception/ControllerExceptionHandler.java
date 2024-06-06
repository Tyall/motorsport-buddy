package pl.softyal.motorsportbuddy.racecalendar.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(RaceEntrySimpleNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ApiErrorDetails raceEntrySimpleNotFoundExceptionHandling(RaceEntrySimpleNotFoundException exception, WebRequest request) {

        return new ApiErrorDetails(
                HttpStatus.NOT_FOUND.value(),
                new Date(),
                exception.getMessage(),
                request.getDescription(false));
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiErrorDetails globalExceptionHandling(Exception exception, WebRequest request) {
        return new ApiErrorDetails(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                new Date(),
                exception.getMessage(),
                request.getDescription(false));
    }

    /*TODO Find out how it behaves when other modules of the application exists. Which parts can be reused.
        In theory it should cover whole application context so bringing it above current packet should be done*/

}
