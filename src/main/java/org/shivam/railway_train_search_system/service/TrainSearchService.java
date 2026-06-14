package org.shivam.railway_train_search_system.service;

import org.shivam.railway_train_search_system.entity.TrainSchedule;
import org.shivam.railway_train_search_system.repository.TrainScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainSearchService {

    private final TrainScheduleRepository trainScheduleRepository;

    public TrainSearchService(
            TrainScheduleRepository trainScheduleRepository) {

        this.trainScheduleRepository = trainScheduleRepository;
    }

    public List<TrainSchedule> findTrainByStationCode(
            String sourceCode,
            String destinationCode) {

        return trainScheduleRepository
                .findBySource_StationCodeAndDestination_StationCode(
                        sourceCode,
                        destinationCode);
    }

    public List<TrainSchedule> findTrainByStationName(
            String sourceName,
            String destinationName) {

        return trainScheduleRepository
                .findBySource_StationNameAndDestination_StationName(
                        sourceName,
                        destinationName);
    }
}