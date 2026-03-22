package com.student.courseregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.student.courseregistration")
public class CourseregistrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseregistrationApplication.class, args);
    }
}