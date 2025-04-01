package com.uab.backend.assignments;

import com.uab.backend.courses.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Integer> {
//    List<Assignment> findAssignmentsByCourseId(Integer courseId);
}
