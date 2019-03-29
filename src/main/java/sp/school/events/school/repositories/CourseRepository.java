package sp.school.events.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sp.school.events.school.models.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}