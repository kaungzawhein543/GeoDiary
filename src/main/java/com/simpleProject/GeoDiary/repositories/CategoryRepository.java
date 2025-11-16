package com.simpleProject.GeoDiary.repositories;

import com.simpleProject.GeoDiary.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Long, Category> {

}
