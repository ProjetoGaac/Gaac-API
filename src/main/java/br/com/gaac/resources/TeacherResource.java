/** Class that represents the resource the TeacherResource
 * Author of the Struct
 * @author Gabriel Oliveira o terror delas
 * @version 1.0.0 */
package br.com.gaac.resources;

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

import br.com.gaac.domain.Subject;
import br.com.gaac.domain.Teacher;
import br.com.gaac.services.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherResource {
	
	@Autowired
	private CourseResource courseResource;
	
	@Autowired
	private FileResource fileResource;
	
	@Autowired
	private SubjectResource subjectResource;
	
	@Autowired
	private TeacherService teacherService;
   
	@PostMapping
    public ResponseEntity<Teacher> save(@RequestBody @Valid Teacher teacher){
        return null;
    }
    
	@PutMapping
    public ResponseEntity<Teacher> update(@RequestBody @Valid Teacher teacher){
        return null;
    }
    
	@DeleteMapping
    public ResponseEntity<Teacher> delete(@RequestBody Teacher teacher){
        return null;
    }
    
	@PostMapping("/subject")
    public ResponseEntity<Teacher> addSubject(@RequestParam Long idTeacher, @RequestParam Long idSubject){
        return null;
    }
    
	@DeleteMapping("/subject")
    public ResponseEntity<Teacher> rmvSubject(@RequestParam Long idTeacher, @RequestParam Long idSubject){
        return null;
    }
    
    @PutMapping("/enable")
    public ResponseEntity<Teacher> enable(@RequestBody @Valid Teacher teacher){
        return null;
    }
    
    @PutMapping("/disable")
    public ResponseEntity<Teacher> disable(@RequestBody @Valid Teacher teacher){
        return null;
    }
    
    public Teacher findById(Long id ){
        return null;
    }
    
    @GetMapping("subject")
    public ResponseEntity<Page<Subject>> findEnrolledSubjects(@RequestParam Long idTeacher, 
    		@RequestParam(defaultValue = "0") Integer page,
    		@RequestParam(defaultValue = "3") Integer quantityPerPage){
        return null;
    }
    
    public ResponseEntity<Page<Subject>> findTeacherByCourse(Long idCourse, Integer page, Integer quantityPerPage){
        return null;
    }
    
    @GetMapping("/course")
    public Page<Teacher> findSubjectsOfCoursesByTeacher(@RequestParam Long idTeacher,
    		@RequestParam(defaultValue = "0") Integer page,
    		@RequestParam(defaultValue = "3") Integer quantityPerPage){
        return null;
    }
    
    @GetMapping
    public ResponseEntity<Page<Teacher>> findAll(
    		@RequestParam(defaultValue = "0") Integer page,
    		@RequestParam(defaultValue = "3") Integer quantityPerPage){
        return null;
    }
    
}
