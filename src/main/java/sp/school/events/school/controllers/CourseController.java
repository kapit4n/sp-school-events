package sp.school.events.school.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sp.school.events.school.models.Course;
import sp.school.events.school.repositories.CourseRepository;

@RestController
@RequestMapping("/api/v1")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;


    @RequestMapping("/courses")
    public List<Course> all() {
        return this.courseRepository.findAll();
    }
}