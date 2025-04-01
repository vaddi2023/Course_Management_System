package com.uab.vansbackend.announcements;

import com.uab.vansbackend.assignments.Assignment;
import com.uab.vansbackend.courses.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, Integer> {
}
