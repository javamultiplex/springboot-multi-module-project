package com.javamultiplex.db.repository;

import com.javamultiplex.db.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Rohit Agarwal on 23/02/22 11:30 PM
 * @copyright www.javamultiplex.com
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
