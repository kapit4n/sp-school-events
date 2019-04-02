package sp.school.events.school.data;

import sp.school.events.school.models.Course;
import sp.school.events.school.models.SchoolYear;
import sp.school.events.school.repositories.CourseRepository;
import sp.school.events.school.repositories.SchoolYearRepository;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  @Bean
  CommandLineRunner initDatabase(CourseRepository repository, SchoolYearRepository year) {
    return args -> {
      repository.save(new Course("1st Grade", "", false));
      repository.save(new Course("2nd Grade", "", false));
      year.save(new SchoolYear("2018", new Date(), new Date(), true, false));
      year.save(new SchoolYear("2019", new Date(), new Date(), true, false));
		};
	}
}