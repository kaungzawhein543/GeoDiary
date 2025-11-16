package com.simpleProject.GeoDiary.repositories;

import com.simpleProject.GeoDiary.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends JpaRepository<Long, Place> {
}
