/** Class that represents the services of the CourseTypeService
 * @author Gabriel Oliveira o terror delas
 * @version 1.0.0 */
package br.com.gaac.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import br.com.gaac.domain.Course;
import br.com.gaac.domain.CourseType;
import br.com.gaac.repositories.CourseTypeRepository;

@Service
public class CourseTypeService {
	
	@Autowired
	private CourseTypeRepository courseTypeRepository;

    public CourseType save(CourseType courseType){
    	return null; //implementar
    }
    
    public CourseType update(CourseType courseType){
    	return null; //implementar
    }
    
    public void delete(Course courseType){
    	//implementar
    }
    
    public CourseType findById(Long id){
    	return null; //implementar
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
