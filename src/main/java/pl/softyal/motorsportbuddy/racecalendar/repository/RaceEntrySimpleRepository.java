package pl.softyal.motorsportbuddy.racecalendar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.softyal.motorsportbuddy.racecalendar.model.RaceEntryId;
import pl.softyal.motorsportbuddy.racecalendar.model.RaceEntrySimple;

import java.util.List;

@Repository
public interface RaceEntrySimpleRepository extends JpaRepository<RaceEntrySimple, RaceEntryId> {

    List<RaceEntrySimple> findByRaceIdSeasonOrderByRaceIdAsc(Integer season);

}
