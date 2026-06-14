package org.shivam.railway_train_search_system.contoller;

import org.shivam.railway_train_search_system.entity.Train;
import org.shivam.railway_train_search_system.service.TrainService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/train")
public class TrainController {

    private final TrainService trainService;

    public TrainController(TrainService trainService) {
        this.trainService = trainService;
    }

    @GetMapping
    public List<Train> getAllTrains() {
        return trainService.getAllTrains();
    }

    @PostMapping("/add")
    public Train addTrain(@RequestBody Train train) {
        return trainService.addTrain(train);
    }

}