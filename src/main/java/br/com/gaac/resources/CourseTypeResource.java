/** Class that represents the resource the of CourseType class
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.resources;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import br.com.gaac.domain.CourseType;


public class CourseTypeResource {

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