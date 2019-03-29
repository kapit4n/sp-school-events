package sp.school.events.school.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sp.school.events.school.models.Course;

@RestController
public class CourseController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/courses")
    public Course[] hello() {
        return new Course[]{
          new Course(counter.incrementAndGet(), "Math", "", false),
          new Course(counter.incrementAndGet(), "Computation", "", false)
        };
    }
}