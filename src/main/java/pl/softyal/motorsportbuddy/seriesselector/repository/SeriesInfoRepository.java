package pl.softyal.motorsportbuddy.seriesselector.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.softyal.motorsportbuddy.seriesselector.model.SeriesInfo;

import java.util.List;

@Repository
public interface SeriesInfoRepository extends JpaRepository<SeriesInfo, Integer> {

    List<SeriesInfo> findAllByOrderByIdAsc();

}
