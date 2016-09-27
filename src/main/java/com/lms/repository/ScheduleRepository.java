package com.lms.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lms.domain.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {
	
	@Query("SELECT s FROM Schedule s WHERE s.category = (:category)")
	ArrayList<Schedule> searchScheduleByCategory(@Param("category") String category);
	
	@Query("SELECT s FROM Schedule s WHERE s.course = (:courseCode)")
	ArrayList<Schedule> searchScheduleByCourseCode(@Param("courseCode") String courseCode);

}
