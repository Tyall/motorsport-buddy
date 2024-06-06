package pl.softyal.motorsportbuddy.seriesselector.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.softyal.motorsportbuddy.seriesselector.model.SeriesInfo;
import pl.softyal.motorsportbuddy.seriesselector.repository.SeriesInfoRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class SeriesSelectorService {

    private final SeriesInfoRepository seriesInfoRepository;

    public List<SeriesInfo> getAvailableSeriesConfiguration() {
        return seriesInfoRepository.findAllByOrderByIdAsc();
    }

}
