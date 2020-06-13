/** Class that represents the resource the of CourseType class
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.gaac.domain.CourseType;
import br.com.gaac.services.CourseTypeService;

@RestController
public class CourseTypeResource {
	
	@Autowired
	private CourseTypeService courseTypeService;

    public ResponseEntity<CourseType> save(CourseType courseType){
        return null; //implementar
    }

    public ResponseEntity<CourseType> update(CourseType courseType){
        return null; //implementar
    }

    public ResponseEntity<?> delete(CourseType courseType){
        return null; //implementar
    }

    public CourseType findById(Long id){
        return null; //implementar
    }

    public ResponseEntity<Page<CourseType>> findAll(Integer page, Integer quantityPerPage){
        return null; //implementar
    }
    
}