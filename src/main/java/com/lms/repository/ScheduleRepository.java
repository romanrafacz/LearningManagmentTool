package com.lms.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lms.domain.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, String> {
	
	@Query("SELECT s FROM Schedule s WHERE s.category = (:category)")
	ArrayList<Schedule> searchScheduleByCategory(@Param("category") String category);
	
	@Query("SELECT s FROM Schedule s WHERE s.course = (:courseCode)")
	ArrayList<Schedule> searchScheduleByCourseCode(@Param("courseCode") String courseCode);
	
	@Query("SELECT s FROM Schedule s WHERE s.scheduleCode = (:scheduleCode)" )
	Schedule searchScheduleByScheduleCode(@Param("scheduleCode") String scheduleCode);
	
	//@Query("SELECT s, l FROM Schedule s, Location l WHERE s.location = l.location and l.location = (:locationCode)")
	@Query("SELECT s FROM Schedule s WHERE s.location = (:locationCode)")
	List<Schedule> searchScheduleByLocationCode(String locationCode);
	
	//@Query("SELECT s, l FROM Schedule s, Location l WHERE s.location = l.locationCode and l.locationCode = 'TL-01138'")
	@Query("SELECT s, l FROM Schedule s, Location l WHERE s.location = 'TL-01138'")
	ArrayList<Schedule> searchScheduleByVirtual();

}
