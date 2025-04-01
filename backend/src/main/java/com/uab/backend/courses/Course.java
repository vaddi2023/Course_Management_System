package com.uab.backend.courses;

import com.uab.backend.announcements.Announcement;
import com.uab.backend.assignments.Assignment;
import com.uab.backend.grades.Grade;
import com.uab.backend.grades.GradeCourse;
import com.uab.backend.quiz.Quiz;
import com.uab.backend.userAuth.models.ApplicationUser;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String code;

    private String name;

    private Boolean isPublished;

    @Column(length = 10000)
    private String syllabus;

    private String term;

    @ManyToOne
    private ApplicationUser professor;

    @ManyToMany
    private Set<ApplicationUser> participants;

    @OneToMany
    private Set<GradeCourse> participantsGrades;

    @OneToMany
    private List<Assignment> assignment;

    @OneToMany
    private List<Quiz> quiz;

    @OneToMany
    private List<Announcement> announcement;
}
