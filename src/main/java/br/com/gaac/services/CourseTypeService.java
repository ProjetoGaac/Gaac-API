/** Class that represents the services of the CourseTypeService
 * @author Gabriel Oliveira o terror delas
 * @version 1.0.0 */
package br.com.gaac.services;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import br.com.gaac.domain.Course;
import br.com.gaac.domain.CourseType;

@Service
public class CourseTypeService {

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
    
    public Page<CourseType> findAll(Integer page, Integer quantityPerPage){
    	return null; //implementar
    }

}
