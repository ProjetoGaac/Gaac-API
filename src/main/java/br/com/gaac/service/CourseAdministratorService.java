/** Class that represents the services of the Course Administrator Class
 * @author Gabriel Batista
 * @version 1.0.0 */
package br.com.gaac.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public class CourseAdministratorService {
	
	public CourseAdministrator save(CourseAdministrator CourseAdministrator) {
		return null; //implementar
	}
	
	public CourseAdministrator update(CourseAdministrator CourseAdministrator) {
		return null; //implementar
	}
	
	public void delete(CourseAdministrator CourseAdministrator) {
		//implementar
	}
	
	public CourseAdministrator enable(CourseAdministrator CourseAdministrator) {
		return null; //implementar
	}
	
	public CourseAdministrator disable(CourseAdministrator CourseAdministrator) {
		return null; //implementar
	}

	public CourseAdministrator findById(Long id) {
		return null; //implementar
	}
	

	public Page<CourseAdministrator> findCourseAdministratorByCourse(Long idCourse, Integer page, Integer quantityPerPage){
		return null; //implementar
	}
	

	public Page<CourseAdministrator> findAll(Integer page, Integer quantityPerPage){
		return null; //implementar
	}
	
}