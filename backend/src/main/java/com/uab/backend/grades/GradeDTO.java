package com.uab.backend.grades;


import com.uab.backend.assignments.AssignmentDTO;
import com.uab.backend.courses.Course;
import com.uab.backend.courses.CourseDTO;
import com.uab.backend.quiz.QuizDTO;
import com.uab.backend.userAuth.models.ApplicationUser;
import com.uab.backend.userAuth.models.ApplicationUserDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
public class GradeDTO {
    private Integer id;

    private Integer grade;

    private String submittedOn;

    private String status;

    private ApplicationUserDTO student;

    public static GradeDTO convertToGradeDTO(Grade grade) {
        GradeDTO gradeDTO = new GradeDTO();
        gradeDTO.setId(grade.getId());
        gradeDTO.setGrade(grade.getGrade());
        gradeDTO.setSubmittedOn(grade.getSubmittedOn());
        gradeDTO.setStatus(grade.getStatus());
        gradeDTO.setStudent(ApplicationUserDTO.convertToApplicationUserDTO(grade.getStudent()));
        return gradeDTO;
    }
}
