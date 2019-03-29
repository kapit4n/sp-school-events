package sp.school.events.school.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sp.school.events.school.models.SchoolYear;

@RestController
public class SchoolYearController {

  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/schoolyears")
  public SchoolYear[] getAll() {
    SchoolYear[] result = { new SchoolYear(counter.incrementAndGet(), 2017),
        new SchoolYear(counter.incrementAndGet(), 2018), new SchoolYear(counter.incrementAndGet(), 2019) };
    return result;
  }
}