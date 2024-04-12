package com.example.bootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
public class BootProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootProjectApplication.class, args);
    }

    @GetMapping("/courses")
    public Map<String, List<String>> getCourses() {
        Map<String, List<String>> courses = new HashMap<>();
        // Foundation courses
        List<String> foundationCourses = new ArrayList<>();
        foundationCourses.add("Computer Literacy for Science (F)");
        foundationCourses.add("Advanced Computer Programming (F)");
        courses.put("Foundation Courses", foundationCourses);

        // Undergraduate courses
        List<String> undergraduateCourses = new ArrayList<>();
        undergraduateCourses.add("Advanced Programming");
        undergraduateCourses.add("Computer Architecture and Organisation");
        undergraduateCourses.add("Software Engineering");
        undergraduateCourses.add("Operating Systems");
        undergraduateCourses.add("Computer Networks");
        courses.put("Undergraduate Courses", undergraduateCourses);

        // Honours courses
        List<String> honoursCourses = new ArrayList<>();
        honoursCourses.add("Advanced Java Programming");
        honoursCourses.add("Mini Project");
        honoursCourses.add("Intelligent Systems");
        honoursCourses.add("Distributed Web Computing");
        courses.put("Honours Courses", honoursCourses);

        return courses;
    }
}

