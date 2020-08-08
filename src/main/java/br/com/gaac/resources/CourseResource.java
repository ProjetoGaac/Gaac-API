/** Class that represents the resource the of Course class
 * Author of the Struct
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.gaac.domain.Course;
import br.com.gaac.domain.CourseAdministrator;
import br.com.gaac.domain.Period;
import br.com.gaac.domain.Subject;
import br.com.gaac.domain.Teacher;
import br.com.gaac.domain.DTOs.CourseDTO;
import br.com.gaac.resources.exceptions.ObjectBadRequestException;
import br.com.gaac.resources.exceptions.ObjectNotFoundException;
import br.com.gaac.services.CourseService;


@RestController
@RequestMapping("/course")
public class CourseResource {
	
	@Autowired
	private CourseTypeResource courseTypeResource;
	
	@Autowired
	private CourseAdministratorResource courseAdministratorResource;
	
	@Autowired
	private SubjectResource subjecResource;
	
	@Autowired
	private TeacherResource teacherResource;
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping
    public ResponseEntity<Course> save(@RequestBody @Valid CourseDTO course){
        return null; //Implementar
    }
    
    /**@author Jorge Gabriel */
	@PutMapping
    public ResponseEntity<Course> update(@RequestBody @Valid Course course){
        
        if(course !=null){

			course = this.courseService.update(course);

			return ResponseEntity.status(HttpStatus.OK).body(course);
			
        }
        throw new ObjectNotFoundException("Nenhum Curso encontrado!");
    }
    
    /**@author Jorge Gabriel */
	@DeleteMapping
    public ResponseEntity<?> delete(@RequestBody Course course){
        
        this.courseService.delete(course);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    
    /**@author Gabriel Batista */
	@PostMapping("/period/subject")
    public ResponseEntity<Period> addSubject(@RequestParam Long idPeriod, @RequestParam Long idSubject){

        Period period = this.courseService.findPeriodById(idPeriod);
        if (period == null){
            throw new ObjectBadRequestException("Id do periodo inválido!");
        }

        Subject subject = this.subjecResource.findById(idSubject);
        if (subject == null){
            throw new ObjectBadRequestException("Id da materia inválido!");
        }

        period = this.courseService.addSubjectPeriod(period, subject);

        if(period == null){
            throw new ObjectBadRequestException("Nao foi possivel adicionar esta materia!");
        }

        return ResponseEntity.status(HttpStatus.OK).body(period);
    }
    
	@DeleteMapping("/period/subject")
    public ResponseEntity<?> rmvSubject(@RequestParam Long idPeriod, @RequestParam Long idSubject){
        return null; //Implementar
    }
    
	@PostMapping("/teacher")
    public ResponseEntity<?> addTeacher(@RequestParam Long idCourse, @RequestParam Long idTeacher){
        return null; //Implementar
    }
    
	@DeleteMapping("/teacher")
    public ResponseEntity<?> rmvTeacher(@RequestParam Long idCourse, @RequestParam Long idTeacher){
        return null; //Implementar
    }
    
	/**@author Felipe Duarte*/
	@PostMapping("/courseAdministator")
    public ResponseEntity<Course> addCourseAdministrator(@RequestParam Long idCourse, @RequestParam Long idCourseAdm){
        
		Course course = this.courseService.findCourseById(idCourse);
		
		if(course == null) throw new ObjectNotFoundException("Nenhum Curso encontrado para o Id Informado!");
		
		CourseAdministrator courseAdministrator = this.courseAdministratorResource.findById(idCourseAdm);
		
		if(courseAdministrator == null ) throw new ObjectNotFoundException("Nenhum Administrador de Curso encontrado para o Id informado!");
		
		Course c = this.courseService.addCourseAdministrator(course, courseAdministrator);
		
		if(c == null) throw new ObjectBadRequestException("Administrador de Curso Já Cadastrado!");
		
		return ResponseEntity.status(HttpStatus.OK).body(c);
		
    }
    
	@DeleteMapping("/courseAdministrator")
    public ResponseEntity<?> rmvCourseAdministrator(@RequestParam Long idCourse, @RequestParam Long idCourseAdm){
        return null; //Implementar
    }
    
	/**@author Felipe Duarte*/
    public Course findCourseById(Long id){
        
    	Course course = this.courseService.findCourseById(id);
    	
    	if(course != null) {
    		return course;
    	}
    	
    	return null;
    }
    
    @GetMapping("/courseAdm")
    public ResponseEntity<Page<Course>> findCoursesByCourseAdm(
    		@RequestParam Long idCourseAdm,
    		@RequestParam(defaultValue = "0") Integer page,
    		@RequestParam(defaultValue = "3") Integer quantityPerPage){
        return null; //Implementar
    }
    
    @GetMapping("/courseType")
    public ResponseEntity<Page<Course>> findCoursesByCourseType(
    		@RequestParam Long idCourseType,
    		@RequestParam(defaultValue = "0") Integer page, 
    		@RequestParam(defaultValue = "3") Integer quantityPerPage){
        return null; //Implementar
    }
    
    public Page<Course> findCoursesByTeacher(Long idTeacher, Integer page, Integer quantityPerPage){
        return null; //Implementar
    }

    @GetMapping("/teacher")
    public ResponseEntity<Page<Teacher>> findAllTeacher(
    		@RequestParam Long idCourse, 
    		@RequestParam(defaultValue = "0") Integer page, 
    		@RequestParam(defaultValue = "3") Integer quantityPerPage){
        return null; //Implementar
    }
    
    @GetMapping("/courseAdministrator")
    public ResponseEntity<Page<CourseAdministrator>> findAllCourseAdministrator(
    		@RequestParam Long idCourse,
    		@RequestParam(defaultValue = "0") Integer page,
    		@RequestParam(defaultValue = "3") Integer quantityPerPage){
        return null; //Implementar
    }
    
    /**@author Jorge Gabriel */
    @GetMapping("/period")
    public ResponseEntity<List<Period>> findAllPeriod(@RequestParam Course idCourse) {
        List<Period> periods = this.courseService.findAllPeriod(idCourse);	
    	
				if(periods != null) {
					return ResponseEntity.status(HttpStatus.OK).body(periods);
				}
				
				throw new ObjectNotFoundException("Nenhum Curso encontrado!");
    }
    
    /**@author Gabriel Batista */
    //not working
    @GetMapping
    public ResponseEntity<Page<Course>> findAllCourse(
    		@RequestParam(defaultValue = "0") Integer page, 
    		@RequestParam(defaultValue = "3") Integer quantityPerPage){
            	Page<Course> courses = this.courseService.findAllCourse(page, quantityPerPage);
                
                if(courses!= null) {

                    return ResponseEntity.status(HttpStatus.OK).body(courses);
                }
                
                throw new ObjectNotFoundException("Nenhum 'tipo de curso' encontrado!");
    }

}