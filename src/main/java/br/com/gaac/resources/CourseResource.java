/** Class that represents the resource the of Course class
 * Author of the Struct
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.resources;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import br.com.gaac.domain.Course;

public class CourseAdministratorResource {
    public  ResponseEntity<Course> save( CourseDTO course ){
        return null; //Implementar
    }
    
    public  ResponseEntity<Course> update( Course course ){
        return null; //Implementar
    }
    
    public  ResponseEntity delete( Course course ){
        return null; //Implementar
    }
    
    public  ResponseEntity<Period> addSubject( Integer  idSubject , Long idPeriod ){
        return null; //Implementar
    }
    
    public  ResponseEntity rmvSubject( Long  idSubject , Long idPeriod ){
        return null; //Implementar
    }
    
    public  ResponseEntity addTeacher( Integer  idTeacher , Long idCourse ){
        return null; //Implementar
    }
    
    public  ResponseEntity rmvTeacher( Long  idTeacher , Long idCourse ){
        return null; //Implementar
    }
    
    public  ResponseEntity addCourseAdministrator( Long  idCourseAdm , Long idCourse ){
        return null; //Implementar
    }
    
    public  ResponseEntity rmvCourseAdministrator( Long  idCourseAdm , Long idCourse ){
        return null; //Implementar
    }
    
    public  Course findCourseById( Long id ){
        return null; //Implementar
    }
    
    public  ResponseEntity<Page<Course>> findCoursesByCourseAdm( Integer  quantityPerPage , Integer  page , Long idCourseAdm ){
        return null; //Implementar
    }
    
    public  ResponseEntity<Page<Course>> findCoursesByCourseType( Integer  quantityPerPage , Integer  page , Long idCourseType ){
        return null; //Implementar
    }
    
    public  Page<Course> findCoursesByTeacher( Integer  quantityPerPage , Integer  page , Long idTeacher ){
        return null; //Implementar
    }
    
    public  ResponseEntity<Page<Teacher>> findAllTeacher( Integer  quantityPerPage , Integer  page , Long idCourse ){
        return null; //Implementar
    }
    
    public  ResponseEntity<Page<CourseAdministrator>> findAllCourseAdministrator( Integer  quantityPerPage , Integer  page , Long idCourse ){
        return null; //Implementar
    }
    
    public  ResponseEntity<ArrayList<Period>> findAllPeriod( Long idCourse ){
        return null; //Implementar
    }
    
    public  ResponseEntity<Page<Course>> findAllCourse( Integer  quantityPerPage , Integer page ){
        return null; //Implementar
    }

}