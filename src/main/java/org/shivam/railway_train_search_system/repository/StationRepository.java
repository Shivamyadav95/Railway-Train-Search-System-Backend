package org.shivam.railway_train_search_system.repository;

import org.shivam.railway_train_search_system.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends JpaRepository<Station, Long> {
}
