/** Class that represents the resource the of CourseAdministrator class
 * Author of the Struct
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.gaac.domain.CourseAdministrator;
import br.com.gaac.resources.exceptions.ObjectBadRequestException;
import br.com.gaac.services.CourseAdministratorService;

@RestController
@RequestMapping("/courseAdministrator")
public class CourseAdministratorResource {
	
	@Autowired
	private CourseAdministratorService courseAdministratorService;
	
	
	@PostMapping
	public ResponseEntity<CourseAdministrator> save(@RequestBody @Valid CourseAdministrator courseAdministrator){
		return null; //Implementar
	}
	
	@PutMapping
	public ResponseEntity<CourseAdministrator> update(@RequestBody @Valid CourseAdministrator courseAdministrator){
		return null; //Implementar
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody CourseAdministrator courseAdministrator){
		return null; //Implementar
	}

	/**@author Felipe Duarte */
	@PutMapping("/enable")
	public ResponseEntity<CourseAdministrator> enable(@RequestBody @Valid CourseAdministrator courseAdministrator){
		
		if(courseAdministrator.getId() == null) {
			throw new ObjectBadRequestException("Falta o id de courseAdministrator");
		}
		
		courseAdministrator = this.courseAdministratorService.enable(courseAdministrator);
		
		return ResponseEntity.status(HttpStatus.OK).body(courseAdministrator);
	}
	
	@DeleteMapping("/disable")
	public ResponseEntity<CourseAdministrator> disable(@RequestBody @Valid CourseAdministrator courseAdministrator){
		return null; //Implementar
	}	
	
	public CourseAdministrator findById(Long id) {
		return null; //implementar
	}

	
	public Page<CourseAdministrator> findCourseAdmsByCourse(Long idCourse, Integer page, 
			Integer quantityPerPage){
		return null; //implementar
	}
	
	@GetMapping
	public ResponseEntity<Page<CourseAdministrator>> findAll(
			@RequestParam(defaultValue = "0") Integer page, 
			@RequestParam(defaultValue = "3") Integer quantityPerPage){
		return null; //implementar
	}
	
}
