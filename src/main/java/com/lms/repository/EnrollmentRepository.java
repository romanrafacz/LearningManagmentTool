package com.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.domain.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer> {

}
