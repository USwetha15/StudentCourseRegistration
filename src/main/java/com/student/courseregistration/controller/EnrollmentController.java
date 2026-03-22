package com.student.courseregistration.controller;

import com.student.courseregistration.model.Enrollment;
import com.student.courseregistration.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/enrollment")
@CrossOrigin(origins = "*")
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @PostMapping
    public Enrollment enroll(@RequestBody Enrollment enrollment) {
        enrollment.setEnrolledDate(LocalDate.now());
        return enrollmentService.enrollStudent(enrollment);
    }

    @GetMapping("/{userId}")
    public List<Enrollment> getMyCourses(@PathVariable int userId) {
        return enrollmentService.getEnrollmentsByUser(userId);
    }

    @GetMapping
    public List<Enrollment> getAllEnrollments() {
        return enrollmentService.getAllEnrollments();
    }
}

