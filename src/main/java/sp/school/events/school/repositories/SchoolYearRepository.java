package sp.school.events.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sp.school.events.school.models.SchoolYear;

@Repository
public interface SchoolYearRepository extends JpaRepository<SchoolYear, Long>{

}