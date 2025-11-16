package com.simpleProject.GeoDiary.repositories;

import com.simpleProject.GeoDiary.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Long, Category> {

}
