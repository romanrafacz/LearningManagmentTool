package com.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.domain.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, String> {

}
