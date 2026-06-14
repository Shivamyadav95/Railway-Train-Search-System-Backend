package org.shivam.railway_train_search_system.contoller;

import org.shivam.railway_train_search_system.entity.TrainSchedule;
import org.shivam.railway_train_search_system.service.TrainSearchService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/search")
public class TrainSearchController {

    private final TrainSearchService trainSearchService;

    public TrainSearchController(
            TrainSearchService trainSearchService) {

        this.trainSearchService = trainSearchService;
    }

    @GetMapping("/byCode")
    public List<TrainSchedule> findTrainByStationCode(
            @RequestParam String sourceCode,
            @RequestParam String destinationCode) {

        return trainSearchService.findTrainByStationCode(
                sourceCode.toUpperCase(),
                destinationCode.toUpperCase());
    }

    @GetMapping("/byName")
    public List<TrainSchedule> findTrainByStationName(
            @RequestParam String sourceName,
            @RequestParam String destinationName) {

        return trainSearchService.findTrainByStationName(
                sourceName,
                destinationName);
    }
}