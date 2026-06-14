package org.shivam.railway_train_search_system.repository;

import org.shivam.railway_train_search_system.entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepository extends JpaRepository<Train,Long> {

}
