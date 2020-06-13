/** Class that represents the services of the Course Administrator Class
 * @author Gabriel Batista
 * @version 1.0.0 */
package br.com.gaac.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import br.com.gaac.domain.CourseAdministrator;
import br.com.gaac.repositories.CourseAdministratorRepository;

@Service
public class CourseAdministratorService {
	
	@Autowired
	private CourseAdministratorRepository courseAdministratorRepository;
	
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