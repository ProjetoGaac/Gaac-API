package br.com.gaac.resources;

import br.com.gaac.domain.Subject;
import br.com.gaac.domain.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

public class TeacherResource {
    public TeacherResource(){

    }
    public ResponseEntity<Teacher> save(Teacher teacher){

    }
    public ResponseEntity<Teacher> update(Teacher){

    }
    public ResponseEntity<Teacher> delete(Teacher teacher){

    }
    public ResponseEntity<Teacher> addSubject(Long idTeacher, Long idSubject){

    }
    public ResponseEntity<Teacher> rmvSubject(Long idTeacher, Long idSubject){

    }
    public ResponseEntity<Teacher> enable(Teacher teacher){

    }
    public ResponseEntity<Teacher> disable(Teacher teacher){

    }
    public Teacher findById(Long id ){

    }
    public ResponseEntity<Page<Subject>> findEnrolledSubjects(Long idTeacher, Integer page,Integer quantityPerPage){

    }
    public ResponseEntity<Page<Subject>> findTeacgerByCourse(Long idCourse, Integer page, Integer quantityPerPage){

    }
    public Page<Teacher> findSubjectsOfCoursesByTeacher(Long idTeacher,Integer page,Integer quantityPerPage){

    }
    public ResponseEntity<Page<Teacher>> findAll(Integer page, Integer quantityPerPage){

    }




}
