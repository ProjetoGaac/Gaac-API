/** Class that represents the resource the of Course class
 * Author of the Struct
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
import br.com.gaac.domain.Teacher;
import br.com.gaac.domain.DTOs.CourseDTO;
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
    
	@PutMapping
    public ResponseEntity<Course> update(@RequestBody @Valid Course course){
        return null; //Implementar
    }
    
	@DeleteMapping
    public ResponseEntity<?> delete(@RequestBody Course course){
        return null; //Implementar
    }
    
	@PostMapping("/period/subject")
    public ResponseEntity<Period> addSubject(@RequestParam Long idPeriod, @RequestParam Long idSubject){
        return null; //Implementar
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
    
	@PostMapping("/courseAdministator")
    public ResponseEntity<?> addCourseAdministrator(@RequestParam Long idCourse, @RequestParam Long idCourseAdm){
        return null; //Implementar
    }
    
	@DeleteMapping("/courseAdministrator")
    public ResponseEntity<?> rmvCourseAdministrator(@RequestParam Long idCourse, @RequestParam Long idCourseAdm){
        return null; //Implementar
    }
    
    public Course findCourseById(Long id){
        return null; //Implementar
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
    
    @GetMapping("/period")
    public ResponseEntity<List<Period>> findAllPeriod(@RequestParam Long idCourse){
        return null; //Implementar
    }
    
    @GetMapping
    public ResponseEntity<Page<Course>> findAllCourse(
    		@RequestParam(defaultValue = "0") Integer page, 
    		@RequestParam(defaultValue = "3") Integer quantityPerPage){
        return null; //Implementar
    }

}