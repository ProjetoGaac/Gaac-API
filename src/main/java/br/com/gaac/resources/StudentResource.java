/** Class that represents the resource the of student class
 * Author of the Struct
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.resources;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import br.com.gaac.domain.Student;

public class CourseAdministratorResource{
    public  ResponseEntity<Student> save( Student student ){
        return null; //Implementar
    }
    
    public  ResponseEntity<StudentPeriod> savePeriod( StudentPeriodDTO  studentPeriod , Long idStudent ){
        return null; //Implementar
    }
    
    public  ResponseEntity<Student> update( Student student ){
        return null; //Implementar
    }
    
    public  ResponseEntity<StudentPeriod> updatePeriod( StudentPeriodDTO studentPeriod ){
        return null; //Implementar
    }
    
    public  ResponseEntity delete( Student student ){
        return null; //Implementar
    }
    
    public  ResponseEntity deletePeriod( StudentPeriod studentPeriod ){
        return null; //Implementar
    }
    
    public  ResponseEntity<Student> enable( Student student ){
        return null; //Implementar
    }
    
    public  ResponseEntity<Student> disable( Student student ){
        return null; //Implementar
    }
    
    public  ResponseEntity<Student> authorizedStudent( Student student ){
        return null; //Implementar
    }
    
    public  Student findById( Long id ){
        return null; //Implementar
    }
    
    public  ResponseEntity<Course> findCourseByStudent( Long idStudent ){
        return null; //Implementar
    }
    
    public  ResponseEntity<Page<Student>> findAllAuthorized( Integer  quantityPerPage , Integer  page , Long idCurso ){
        return null; //Implementar
    }
    
    public  ResponseEntity<Page<Student>> findAllStudentByCourse( Integer  quantityPerPage , Integer  page , Long idCourse ){
        return null; //Implementar
    }
    
    public  ResponseEntity<Page<StudentPeriod>> findAllStudentPeriod( Integer  quantityPerPage , Integer  page , Long idStudent ){
        return null; //Implementar
    }
    
    public  ResponseEntity<Page<Student>> findAllStudents( Integer  quantityPerPage , Integer page ){
        return null; //Implementar
    }
}