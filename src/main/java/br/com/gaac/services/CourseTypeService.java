/** Class that represents the services of the CourseTypeService
 * @author Gabriel Oliveira o terror delas
 * @version 1.0.0 */
package br.com.gaac.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
 
import br.com.gaac.domain.Course;
import br.com.gaac.domain.CourseType;
import br.com.gaac.repositories.CourseTypeRepository;
import br.com.gaac.resources.exceptions.ObjectNotFoundException;

@Service
public class CourseTypeService {
	
	@Autowired
	private CourseTypeRepository courseTypeRepository;

	/**@author Gabriel Batista */
    public CourseType save(CourseType courseType){
		CourseType ct = this.courseTypeRepository.findByName(courseType.getName());

		if(ct == null) {
			ct = this.courseTypeRepository.save(courseType);
			return ct;
		}

		return null;
    }
    
	/**@author Gabriel Oliveira */
    public CourseType update(CourseType courseType){
    	//aqui eu busquei o id utilizando o argumento recebido pela função
    	Optional<CourseType> ct = this.courseTypeRepository.findById(courseType.getId());
    	if(ct.isPresent()) {
    		return ct.get();
    	}
    	return null; 
    }
    
    public void delete(Course courseType){
    	//implementar
    }
	 
	/**@author Gabriel Batista */
    public CourseType findById(Long id){
		Optional<CourseType> ct = this.courseTypeRepository.findById(id);
		if(ct.isPresent()) {
    		return ct.get();
    	}
    	
    	return null;
    }
    
    /**@author Felipe Duarte*/
    public Page<CourseType> findAll(Integer page, Integer quantityPerPage){
    	
    	PageRequest pageRequest = PageRequest.of(page, quantityPerPage);
    	
    	Page<CourseType> courseTypes = this.courseTypeRepository.findAll(pageRequest);
    	
    	if(!courseTypes.getContent().isEmpty()) {
    		return courseTypes;
    	}
    	
    	return null;
    }

}
