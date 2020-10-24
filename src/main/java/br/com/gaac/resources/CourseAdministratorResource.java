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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.gaac.domain.CourseAdministrator;
import br.com.gaac.resources.exceptions.ObjectNotFoundException;
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
	
	/**@author Gabriel Batista */
	@PutMapping
	public ResponseEntity<CourseAdministrator> update(@RequestBody @Valid CourseAdministrator courseAdministrator){
		
		CourseAdministrator ca = this.courseAdministratorService.update(courseAdministrator);
		
		if(ca !=null){

			return ResponseEntity.status(HttpStatus.OK).body(ca);
			
        }
		
        throw new ObjectNotFoundException("Nenhum 'Administrador de Curso' encontrado com esta ID!");
	}
	
	
	/**@author Gabriel Oliveira */
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody CourseAdministrator courseAdministrator){
		//delete simples utilizando a Service para chamar a função delete e na segunda linha de código um retornando um status ok 
		this.courseAdministratorService.delete(courseAdministrator);
		return ResponseEntity.status(HttpStatus.OK).build();
		
	}

	/**@author Flip Duarte */
	@PutMapping("/enable/{id}")
	public ResponseEntity<CourseAdministrator> enable(@PathVariable("id") Long id){
		
		CourseAdministrator ca = this.courseAdministratorService.enable(id);
		
		if(ca != null) {
			return ResponseEntity.status(HttpStatus.OK).body(ca);
		}
		
		throw new ObjectNotFoundException("Administrador de Curso não encontrado para o id informado!");
		
	}
	
	/**@author Gabriel Batista */
	@PutMapping("/disable/{id}")
	public ResponseEntity<CourseAdministrator> disable(@PathVariable("id") Long id){
		
		CourseAdministrator ca = this.courseAdministratorService.disable(id);
		
		if(ca != null) {
			return ResponseEntity.status(HttpStatus.OK).body(ca);
		}
		
		throw new ObjectNotFoundException("Administrador de Curso não encontrado para o id informado!");
	}	

	/**@author Gabriel Batista */
	public CourseAdministrator findById(Long id) {
		CourseAdministrator courseAdministrator = this.courseAdministratorService.findById(id);
        if(courseAdministrator !=null){
            return courseAdministrator;
        }
        return null;
	}

	
	public Page<CourseAdministrator> findCourseAdmsByCourse(Long idCourse, Integer page, 
			Integer quantityPerPage){
		return null; //implementar
	}
	
	/**@author Gabriel Batista */
	@GetMapping
	public ResponseEntity<Page<CourseAdministrator>> findAll(
			@RequestParam(defaultValue = "0") Integer page, 
			@RequestParam(defaultValue = "3") Integer quantityPerPage){
				Page<CourseAdministrator> courseAdministrators = this.courseAdministratorService.findAll(page, quantityPerPage);
    	
				if(courseAdministrators != null) {
					return ResponseEntity.status(HttpStatus.OK).body(courseAdministrators);
				}
				
				throw new ObjectNotFoundException("Nenhum 'Administrador de curso' encontrado!");
	}
	
}
