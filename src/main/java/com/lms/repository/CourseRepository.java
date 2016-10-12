package com.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lms.domain.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
	
//	@Query("SELECT course_code from course WHERE course_code = (:courseCode)")
//	List<Course> findByCourseCode(@Param("courseCode") String courseCode);
//	 

}
