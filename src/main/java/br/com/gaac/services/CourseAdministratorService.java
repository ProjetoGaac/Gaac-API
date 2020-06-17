/** Class that represents the services of the Course Administrator Class
 * @author Gabriel Batista
 * @version 1.0.0 */
package br.com.gaac.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import br.com.gaac.domain.CourseAdministrator;
import br.com.gaac.domain.Enums.UserCategory;
import br.com.gaac.repositories.CourseAdministratorRepository;
 
@Service
public class CourseAdministratorService {
	
	@Autowired
	private CourseAdministratorRepository courseAdministratorRepository;
	
	public CourseAdministrator save(CourseAdministrator courseAdministrator) {
		return null; //implementar
	}
	
	/**@author Gabriel Batista */
	public CourseAdministrator update(CourseAdministrator courseAdministrator) {
		return this.courseAdministratorRepository.save(courseAdministrator);
	}
	
	public void delete(CourseAdministrator courseAdministrator) {
		//implementar
	}
	
	/**@author Felipe Duarte*/
	public CourseAdministrator enable(CourseAdministrator courseAdministrator) {
		
		courseAdministrator.addCourseAdministratorCategory(UserCategory.COURSE_ADMINISTRATOR_GENERAL.getCode());
		
		courseAdministrator = this.courseAdministratorRepository.save(courseAdministrator);
		
		return courseAdministrator;
	}
	
	public CourseAdministrator disable(CourseAdministrator courseAdministrator) {
		return null; //implementar
	}

	/**@author Gabriel Batista */
	public CourseAdministrator findById(Long id) {
		Optional<CourseAdministrator> ct = this.courseAdministratorRepository.findById(id);
		if(ct.isPresent()) {
    		return ct.get();
    	}
    	
    	return null;
	}
	
	public Page<CourseAdministrator> findCourseAdministratorByCourse(Long idCourse, Integer page, Integer quantityPerPage){
		return null; //implementar
	}
	
	/**@author Gabriel Batista */
	public Page<CourseAdministrator> findAll(Integer page, Integer quantityPerPage){
		PageRequest pageRequest = PageRequest.of(page, quantityPerPage);
    	
    	Page<CourseAdministrator> courseAdministrators = this.courseAdministratorRepository.findAll(pageRequest);
    	
    	if(!courseAdministrators.getContent().isEmpty()) {
    		return courseAdministrators;
		}
		return null;
	}
	
}