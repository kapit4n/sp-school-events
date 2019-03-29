package sp.school.events.school.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sp.school.events.school.models.School;

@RestController
public class SchoolController {

    private static final String template = "%s! School";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/hello")
    public School hello(@RequestParam(value = "name", defaultValue = "Code") String name) {
        return new School(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping("")
    public String home() {
        return "School Events Api";
    }
}