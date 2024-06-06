package pl.softyal.motorsportbuddy.racecalendar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.softyal.motorsportbuddy.racecalendar.model.RaceEntryId;
import pl.softyal.motorsportbuddy.racecalendar.model.RaceEntrySession;

@Repository
public interface RaceEntrySessionRepository extends JpaRepository<RaceEntrySession, RaceEntryId> {
}
