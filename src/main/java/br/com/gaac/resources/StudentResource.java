/** Class that represents the resource the of student class
 * Author of the Struct
 * @author Gabriel Batista
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


import br.com.gaac.resources.exceptions.ObjectBadRequestException;

import br.com.gaac.domain.Course;
import br.com.gaac.domain.Student;
import br.com.gaac.domain.StudentPeriod;
import br.com.gaac.domain.DTOs.StudentPeriodDTO;
import br.com.gaac.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentResource{
	
	@Autowired
	private SubjectResource subjectResource;
	
	@Autowired
	private CourseResource courseResource;
	
	@Autowired
	private StudentService studentService;
	/**@author Gabriel Batista */
	@PostMapping
    public ResponseEntity<Student> save(@RequestBody @Valid Student student){

        if(student.getMatriculation() == null) {
			throw new ObjectBadRequestException("Falta a matricula do estudante");
        }
        if(student.getEmail() == null) {
			throw new ObjectBadRequestException("Falta o email do estudante");
		}
        Student s = this.studentService.findByMatriculation(student.getMatriculation());
        if(s != null) {
			throw new ObjectBadRequestException("Matricula Já Cadastrada");
        }

        s = this.studentService.findByEmail(student.getEmail());
        if(s != null) {
			throw new ObjectBadRequestException("Email Já Cadastrado");
        }
        
        student = this.studentService.save(s);
        return ResponseEntity.status(HttpStatus.CREATED).body(student);
        
		
    }
    
	@PostMapping("/studentPeriod")
    public ResponseEntity<StudentPeriod> savePeriod(@RequestParam Long idStudent, 
    		@RequestBody @Valid StudentPeriodDTO studentPeriod){
        return null; //Implementar
    }
    
	@PutMapping
    public ResponseEntity<Student> update(@RequestBody @Valid Student student){
        return null; //Implementar
    }
    
	@PutMapping("/studentPeriod")
    public ResponseEntity<StudentPeriod> updatePeriod(@RequestBody @Valid StudentPeriodDTO studentPeriod){
        return null; //Implementar
    }
    
    /**@author Gabriel Batista */
	@DeleteMapping
    public ResponseEntity<?> delete(@RequestBody Student student){
       Student s  =this.studentService.findByMatriculation(student.getMatriculation());
        if(s== null){
            //System.out.println(student.getMatriculation());
            throw new ObjectBadRequestException("matricula nao encontrada");
        }
        this.studentService.delete(s);
		
		return ResponseEntity.status(HttpStatus.OK).build();
    }
    
	@DeleteMapping("/studentPeriod")
    public ResponseEntity<?> deletePeriod(@RequestBody StudentPeriod studentPeriod){
        return null; //Implementar
    }
    
	@PutMapping("/enable")
    public ResponseEntity<Student> enable(@RequestBody @Valid Student student){
        return null; //Implementar
    }
    
	@PutMapping("/disable")
    public ResponseEntity<Student> disable(@RequestBody @Valid Student student){
        return null; //Implementar
    }
    
	@PutMapping("/authorized")
    public ResponseEntity<Student> authorizedStudent(@RequestBody @Valid Student student){
        return null; //Implementar
    }
    
    public Student findById(Long id){
        return null; //Implementar
    }
    
    @GetMapping("{idStudent}/course")
    public ResponseEntity<Course> findCourseByStudent(@PathVariable Long idStudent){
        return null; //Implementar
    }
    
    @GetMapping("/authorized")
    public ResponseEntity<Page<Student>> findAllAuthorized(@RequestParam Long idCurso, 
    		@RequestParam(defaultValue = "0") Integer page, 
    		@RequestParam(defaultValue = "3") Integer quantityPerPage){
        return null; //Implementar
    }
    
    @GetMapping("/course")
    public ResponseEntity<Page<Student>> findAllStudentByCourse(@RequestParam Long idCourse, 
    		@RequestParam(defaultValue = "0") Integer page, 
    		@RequestParam(defaultValue = "3") Integer quantityPerPage){
        return null; //Implementar
    }
    
    @GetMapping("/studentPeriod")
    public ResponseEntity<Page<StudentPeriod>> findAllStudentPeriod(@RequestParam Long idStudent,
    		@RequestParam(defaultValue = "0") Integer page, 
    		@RequestParam(defaultValue = "3") Integer quantityPerPage){
        return null; //Implementar
    }
    
    @GetMapping
    public ResponseEntity<Page<Student>> findAllStudents(
    		@RequestParam(defaultValue = "0") Integer page,
    		@RequestParam(defaultValue = "3") Integer quantityPerPage){
        return null; //Implementar
    }
    
}