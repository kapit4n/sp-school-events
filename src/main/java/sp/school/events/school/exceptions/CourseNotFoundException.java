package sp.school.events.school.exceptions;


public class CourseNotFoundException extends RuntimeException {

	public CourseNotFoundException(Long id) {
		super("Could not find Course " + id);
	}
}