package com.simpleProject.GeoDiary.repositories;

import com.simpleProject.GeoDiary.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Long, Review> {
}
