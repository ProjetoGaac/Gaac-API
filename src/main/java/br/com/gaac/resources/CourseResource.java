/** Class that represents the resource the of Course class
 * Author of the Struct
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.resources;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import br.com.gaac.domain.Course;
import br.com.gaac.domain.CourseAdministrator;
import br.com.gaac.domain.Period;
import br.com.gaac.domain.Teacher;
import br.com.gaac.domain.DTOs.CourseDTO;

public class CourseResource {
	
    public ResponseEntity<Course> save(CourseDTO course){
        return null; //Implementar
    }
    
    public ResponseEntity<Course> update(Course course){
        return null; //Implementar
    }
    
    public ResponseEntity<?> delete(Course course){
        return null; //Implementar
    }
    
    public ResponseEntity<Period> addSubject(Long idPeriod, Long idSubject){
        return null; //Implementar
    }
    
    public ResponseEntity<?> rmvSubject(Long idPeriod, Long idSubject){
        return null; //Implementar
    }
    
    public ResponseEntity<?> addTeacher(Long idCourse, Long idTeacher){
        return null; //Implementar
    }
    
    public ResponseEntity<?> rmvTeacher(Long idCourse, Long idTeacher){
        return null; //Implementar
    }
    
    public ResponseEntity<?> addCourseAdministrator(Long idCourse, Long idCourseAdm){
        return null; //Implementar
    }
    
    public ResponseEntity<?> rmvCourseAdministrator(Long idCourse, Long idCourseAdm){
        return null; //Implementar
    }
    
    public Course findCourseById(Long id){
        return null; //Implementar
    }
    
    public ResponseEntity<Page<Course>> findCoursesByCourseAdm(Long idCourseAdm, Integer  page, Integer quantityPerPage){
        return null; //Implementar
    }
    
    public ResponseEntity<Page<Course>> findCoursesByCourseType(Long idCourseType, Integer  page, Integer quantityPerPage){
        return null; //Implementar
    }
    
    public Page<Course> findCoursesByTeacher(Long idTeacher, Integer page, Integer quantityPerPage){
        return null; //Implementar
    }
    
    public ResponseEntity<Page<Teacher>> findAllTeacher(Long idCourse, Integer page, Integer quantityPerPage){
        return null; //Implementar
    }
    
    public ResponseEntity<Page<CourseAdministrator>> findAllCourseAdministrator(Long idCourse, Integer page, Integer quantityPerPage){
        return null; //Implementar
    }
    
    public ResponseEntity<List<Period>> findAllPeriod(Long idCourse){
        return null; //Implementar
    }
    
    public ResponseEntity<Page<Course>> findAllCourse(Integer page, Integer quantityPerPage){
        return null; //Implementar
    }

}