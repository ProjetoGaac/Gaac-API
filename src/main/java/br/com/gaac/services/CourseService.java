package br.com.gaac.services;

import br.com.gaac.domain.*;
import org.springframework.data.domain.Page;

import java.util.ArrayList;

public class CourseService {
    public void CourseService(){

    }
    public Course save(Course course){

    }
    public Course update(Course course){

    }
    public void delete(Course course){

    }
    public void addTeacher(Course course, Teacher teacher){

    }
    public void rmvTeacher(Course course, Teacher teacher){

    }
    public void rmvCourseAdministrator(Course course, CourseAdministrator courseAdm){

    }
    public void addCourseAdministrator(Course course,CourseAdministrator courseAdm){

    }
    public void addSubjectPeriod(Period period, Subject subject){

    }
    public void rmvSubjectPeriod(Period period, Subject subject){

    }
    public Course findCourseById(Long id){

    }
    public Period findPeriodById(Long id){

    }
    public Page<Course> findCoursesByCourseAdm(Long idCourseAdm, Integer page,Integer quantityPerPage){

    }
    public Page<Course> findCoursesByTeacher(Long idTeacher, Integer page,, Integer quantityPerPage){

    }
    public Page<Course> findCoursesByCourseType(Long idTeacher, Integer page, Integer quantityPerPage){

    }
    public ArrayList<Period> findAllPeriod(Long idCourse){

    }
    public Page<Course> findAllCourse(Integer page, Integer quantityPerPage){

    }



}
