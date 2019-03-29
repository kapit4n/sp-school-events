package sp.school.events.school.controllers;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sp.school.events.school.models.SchoolYear;

@RestController
public class SchoolYearController {

  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/schoolyears")
  public SchoolYear[] getAll() {
    SchoolYear[] result = { new SchoolYear(counter.incrementAndGet(), "2017", new Date(), new Date(), true, false),
        new SchoolYear(counter.incrementAndGet(), "2018", new Date(), new Date(), true, false), 
        new SchoolYear(counter.incrementAndGet(), "2019", new Date(), new Date(), true, false) };
    return result;
  }
}