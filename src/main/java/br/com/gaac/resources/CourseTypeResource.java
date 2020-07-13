/** Class that represents the resource the of CourseType class
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.gaac.domain.CourseType;
import br.com.gaac.resources.exceptions.ObjectBadRequestException;
import br.com.gaac.resources.exceptions.ObjectNotFoundException;
import br.com.gaac.services.CourseTypeService;

@RestController
@RequestMapping("/courseType")
public class CourseTypeResource {
	
	@Autowired
	private CourseTypeService courseTypeService;

    /**@author Gabriel Batista */
	@PostMapping
    public ResponseEntity<CourseType> save(@RequestBody @Valid CourseType courseType){
        courseType = this.courseTypeService.save(courseType);
        if(courseType != null) {
			return ResponseEntity.status(HttpStatus.CREATED).body(courseType);
		}
		
		throw new ObjectBadRequestException("Tipo de curso Já Cadastrado");
    }
	  /**@author Gabriel Oliveira */
	@PutMapping
    public ResponseEntity<CourseType> update(@RequestBody @Valid CourseType courseType){
        courseType = this.courseTypeService.update(courseType);
	    if(courseType != null){
	        return ResponseEntity.status(HttpStatus.OK).body(courseType);
        }
	    throw new ObjectNotFoundException("Course type not found");
    } 
    /**@author Jorge Gabriel */
	@DeleteMapping
    public ResponseEntity<?> delete(@RequestBody CourseType courseType){
        this.courseTypeService.delete(courseType);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    /**@author Gabriel Batista */
    public CourseType findById(Long id){
        CourseType courseType = this.courseTypeService.findById(id);
        if(courseType !=null){
            return courseType;
        }
        throw new ObjectNotFoundException("Nenhum 'tipo de curso' encontrado!");
    }
    
    /**@author Felipe Duarte*/
    @GetMapping
    public ResponseEntity<Page<CourseType>> findAll(
    		@RequestParam(defaultValue = "0") Integer page,
    		@RequestParam(defaultValue = "3") Integer quantityPerPage){
        
    	Page<CourseType> courseTypes = this.courseTypeService.findAll(page, quantityPerPage);
    	
    	if(courseTypes != null) {
    		return ResponseEntity.status(HttpStatus.OK).body(courseTypes);
    	}
    	
    	throw new ObjectNotFoundException("Nenhum 'tipo de curso' encontrado!");
    }
    
}