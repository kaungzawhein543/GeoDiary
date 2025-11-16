package com.simpleProject.GeoDiary.repositories;

import com.simpleProject.GeoDiary.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Long, Place> {
}
