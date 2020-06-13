/** Class that represents the resource the of CourseAdministrator class
 * Author of the Struct
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.gaac.domain.CourseAdministrator;
import br.com.gaac.services.CourseAdministratorService;

@RestController
public class CourseAdministratorResource {
	
	@Autowired
	private CourseAdministratorService courseAdministratorService;
	
	public ResponseEntity<CourseAdministrator> save(CourseAdministrator courseAdministrator){
		return null; //Implementar
	}
	
	public ResponseEntity<CourseAdministrator> update(CourseAdministrator courseAdministrator){
		return null; //Implementar
	}
	
	public ResponseEntity<?> delete(CourseAdministrator courseAdministrator){
		return null; //Implementar
	}

	public ResponseEntity<CourseAdministrator> enable(CourseAdministrator courseAdministrator){
		return null; //Implementar
	}
	
	public ResponseEntity<CourseAdministrator> disable(CourseAdministrator courseAdministrator){
		return null; //Implementar
	}
	
	public CourseAdministrator findById(Long id) {
		return null; //implementar
	}

	public Page<CourseAdministrator> findCourseAdmsByCourse(Long idCourse, Integer page, 
			Integer quantityPerPage){
		return null; //implementar
	}
	
	public ResponseEntity<Page<CourseAdministrator>> findAll(Integer page, Integer quantityPerPage){
		return null; //implementar
	}
	
}
