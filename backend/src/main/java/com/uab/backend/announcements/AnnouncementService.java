package com.uab.vansbackend.announcements;

import com.uab.vansbackend.assignments.Assignment;
import com.uab.vansbackend.courses.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnnouncementService {
    @Autowired
    AnnouncementRepository announcementRepository;

    public Announcement addAnnouncement(Announcement announcement) {
        return announcementRepository.save(announcement);
    }

}
