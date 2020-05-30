/** Class that represents the resource the of CourseAdministrator class
 * Author of the Struct
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.resources;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

public class CourseAdministratorResource {
	
	/** Method to save course administrator
	 * @param CourseAdministrator - courseAdministrator 
	 * @return ResponseEntity<CourseAdministrator> */
	public ResponseEntity<CourseAdministrator> save(CourseAdministrator courseAdministrator){
		return null; //Implementar
	}
	
	/** Method to update course administrator
	 * @param CourseAdministrator - courseAdministrator 
	 * @return ResponseEntity<CourseAdministrator> */
	public ResponseEntity<CourseAdministrator> update(CourseAdministrator courseAdministrator){
		return null; //Implementar
	}
	
	/** Method to delete course administrator
	 * @param CourseAdministrator - courseAdministrator 
	 * @return ResponseEntity */
	public ResponseEntity<?> delete(CourseAdministrator courseAdministrator){
		return null; //Implementar
	}
	
	/** Method to enable course administrator to COURSE_ADMINISTRATOR_GENERAL
	 * @param CourseAdministrator - courseAdministrator 
	 * @return ResponseEntity<CourseAdministrator> */
	public ResponseEntity<CourseAdministrator> enable(CourseAdministrator courseAdministrator){
		return null; //Implementar
	}
	
	/** Method to disable course administrator
	 * @param CourseAdministrator - courseAdministrator 
	 * @return ResponseEntity<CourseAdministrator> */
	public ResponseEntity<CourseAdministrator> disable(CourseAdministrator courseAdministrator){
		return null; //Implementar
	}
	
	/** Method to find courseAdministrator from id
	 * @param Long - id 
	 * @return CourseAdministrator */
	public CourseAdministrator findById(Long id) {
		return null; //implementar
	}
	
	/** Method to find course course administrators
	 * @param Long - idCourse
	 * @param Integer - page
	 * @param Integer - quantityPerPage 
	 * @return Page<CourseAdministrator> */
	public Page<CourseAdministrator> findCourseAdmsByCourse(Long idCourse, Integer page, 
			Integer quantityPerPage){
		return null; //implementar
	}
	
	/** Method to find all course administrators
	 * @param Integer - page
	 * @param Integer - quantityPerPage 
	 * @return ResponseEntity<Page<CourseAdministrator>> */
	public ResponseEntity<Page<CourseAdministrator>> findAll(Integer page, Integer quantityPerPage){
		return null; //implementar
	}
	
}
