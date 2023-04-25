package com.School.School.Repository;

import com.School.School.Entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface schoolRepository extends JpaRepository<School,Integer> {
}
