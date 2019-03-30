package sp.school.events.school.controllers;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sp.school.events.school.models.SchoolYear;
import sp.school.events.school.repositories.SchoolYearRepository;

@RestController
@RequestMapping("/api/v1")
public class SchoolYearController {

  @Autowired
  private SchoolYearRepository repo;

  @RequestMapping("/years")
  public List<SchoolYear> getAll() {
    return repo.findAll();
  }
}