package org.shivam.railway_train_search_system.service;

import org.shivam.railway_train_search_system.entity.Train;
import org.shivam.railway_train_search_system.repository.TrainRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {

    private final TrainRepository trainRepository;

    public TrainService(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public List<Train> getAllTrains() {
        return trainRepository.findAll();
    }

    public Train addTrain(Train train) {
        return trainRepository.save(train);
    }
}