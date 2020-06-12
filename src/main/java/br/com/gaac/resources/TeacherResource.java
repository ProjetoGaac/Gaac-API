/** Class that represents the resource the TeacherResource
 * Author of the Struct
 * @author Gabriel Oliveira o terror delas
 * @version 1.0.0 */
package br.com.gaac.resources;

import br.com.gaac.domain.Subject;
import br.com.gaac.domain.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

public class TeacherResource {
    public TeacherResource(){

    }
    public ResponseEntity<Teacher> save(Teacher teacher){
        return null;
    }
    public ResponseEntity<Teacher> update(Teacher teacher){
        return null;
    }
    public ResponseEntity<Teacher> delete(Teacher teacher){
        return null;
    }
    public ResponseEntity<Teacher> addSubject(Long idTeacher, Long idSubject){
        return null;
    }
    public ResponseEntity<Teacher> rmvSubject(Long idTeacher, Long idSubject){
        return null;
    }
    public ResponseEntity<Teacher> enable(Teacher teacher){
        return null;
    }
    public ResponseEntity<Teacher> disable(Teacher teacher){
        return null;
    }
    public Teacher findById(Long id ){
        return null;
    }
    public ResponseEntity<Page<Subject>> findEnrolledSubjects(Long idTeacher, Integer page,Integer quantityPerPage){
        return null;
    }
    public ResponseEntity<Page<Subject>> findTeacgerByCourse(Long idCourse, Integer page, Integer quantityPerPage){
        return null;
    }
    public Page<Teacher> findSubjectsOfCoursesByTeacher(Long idTeacher,Integer page,Integer quantityPerPage){
        return null;
    }
    public ResponseEntity<Page<Teacher>> findAll(Integer page, Integer quantityPerPage){
        return null;
    }




}
