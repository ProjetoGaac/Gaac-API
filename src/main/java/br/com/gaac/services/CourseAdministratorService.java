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
	
	/**@author Jorge Gabriel */
	public CourseAdministrator save(CourseAdministrator courseAdministrator) {
		CourseAdministrator ca = this.courseAdministratorRepository.findByNameAndEmail(courseAdministrator.getName(),courseAdministrator.getEmail());
		ca = this.courseAdministratorRepository.save(courseAdministrator);
		
		if(ca != null) {
			return null;
		}
		
		return ca;
		
	}
	
	/**@author Gabriel Batista */
	public CourseAdministrator update(CourseAdministrator courseAdministrator) {
		
		Optional<CourseAdministrator> ca = this.courseAdministratorRepository.findById(courseAdministrator.getId());
		
		if(ca.isPresent()) {
			return this.courseAdministratorRepository.save(ca.get());
		}
		
		return null;
	}
	/**@author Gabriel Oliveira */
	public void delete(CourseAdministrator courseAdministrator) {
		this.courseAdministratorRepository.delete(courseAdministrator);
		
	}
	
	/**@author Felipe Duarte*/
	public CourseAdministrator enable(Long id) {
		
		Optional<CourseAdministrator> ca = this.courseAdministratorRepository.findById(id);
		
		if(ca.isPresent()) {
		
			ca.get().addCourseAdministratorCategory(UserCategory.COURSE_ADMINISTRATOR_GENERAL.getCode());
		
			return this.courseAdministratorRepository.save(ca.get());
		}
		
		return null;
	}
	
	/**@author Gabriel Batista */
	public CourseAdministrator disable(Long id) {
		
		Optional<CourseAdministrator> ca = this.courseAdministratorRepository.findById(id);
		
		if(ca.isPresent()) {
		
			ca.get().rmvCourseAdministratorCategory(UserCategory.COURSE_ADMINISTRATOR_GENERAL.getCode());
		
			return this.courseAdministratorRepository.save(ca.get());
		
		}
		
		return null;
	}

	/**@author Gabriel Batista */
	public CourseAdministrator findById(Long id) {
		Optional<CourseAdministrator> ct = this.courseAdministratorRepository.findById(id);
		if(ct.isPresent()) {
    		return ct.get();
    	}
    	
    	return null;
	}
	
	/**@author Jorge Gabriel */
	public Page<CourseAdministrator> findCourseAdministratorByCourse(Long idCourse, Integer page, Integer quantityPerPage){
		Optional<Page<CourseAdministrator>> ca = this.courseAdministratorRepository.findByCourses(idCourse, page);
		if(ca.isPresent()){
			return ca.get();
		}
		return null;
	};
	
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