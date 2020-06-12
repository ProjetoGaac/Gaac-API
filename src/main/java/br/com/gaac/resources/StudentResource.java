/** Class that represents the resource the of student class
 * Author of the Struct
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.resources;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.gaac.domain.Course;
import br.com.gaac.domain.Student;
import br.com.gaac.domain.StudentPeriod;
import br.com.gaac.domain.DTOs.StudentPeriodDTO;

@RestController
public class StudentResource{
	
    public ResponseEntity<Student> save(Student student){
        return null; //Implementar
    }
    
    public ResponseEntity<StudentPeriod> savePeriod(Long idStudent, StudentPeriodDTO studentPeriod){
        return null; //Implementar
    }
    
    public ResponseEntity<Student> update(Student student){
        return null; //Implementar
    }
    
    public ResponseEntity<StudentPeriod> updatePeriod(StudentPeriodDTO studentPeriod){
        return null; //Implementar
    }
    
    public ResponseEntity<?> delete(Student student){
        return null; //Implementar
    }
    
    public ResponseEntity<?> deletePeriod(StudentPeriod studentPeriod){
        return null; //Implementar
    }
    
    public ResponseEntity<Student> enable(Student student){
        return null; //Implementar
    }
    
    public ResponseEntity<Student> disable(Student student){
        return null; //Implementar
    }
    
    public ResponseEntity<Student> authorizedStudent(Student student){
        return null; //Implementar
    }
    
    public Student findById(Long id){
        return null; //Implementar
    }
    
    public ResponseEntity<Course> findCourseByStudent(Long idStudent){
        return null; //Implementar
    }
    
    public ResponseEntity<Page<Student>> findAllAuthorized(Long idCurso, Integer page, Integer quantityPerPage){
        return null; //Implementar
    }
    
    public ResponseEntity<Page<Student>> findAllStudentByCourse(Long idCourse, Integer page, Integer quantityPerPage){
        return null; //Implementar
    }
    
    public ResponseEntity<Page<StudentPeriod>> findAllStudentPeriod(Long idStudent, Integer page, Integer quantityPerPage){
        return null; //Implementar
    }
    
    public ResponseEntity<Page<Student>> findAllStudents(Integer page, Integer quantityPerPage){
        return null; //Implementar
    }
    
}