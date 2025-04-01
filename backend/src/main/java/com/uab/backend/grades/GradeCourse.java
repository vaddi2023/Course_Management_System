package com.uab.backend.grades;


import com.uab.backend.courses.Course;
import com.uab.backend.userAuth.models.ApplicationUser;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class GradeCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer grade;

    @ManyToOne
    private ApplicationUser student;

    public GradeCourse(Integer grade, ApplicationUser student) {
        this.grade = grade;
        this.student = student;
    }
}
