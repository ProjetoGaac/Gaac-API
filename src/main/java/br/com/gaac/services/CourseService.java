/** Class that represents Subject
 * @author Gabriel Oliveira o terror delas
 * @version 1.0.0 */
package br.com.gaac.services;

import java.util.List;

import org.springframework.data.domain.Page;

import br.com.gaac.domain.Course;
import br.com.gaac.domain.CourseAdministrator;
import br.com.gaac.domain.Period;
import br.com.gaac.domain.Subject;
import br.com.gaac.domain.Teacher;

public class CourseService {

    public Course save(Course course){
    	return null; //implementar
    }
    
    public Course update(Course course){
    	return null; //implementar
    }
    
    public void delete(Course course){
    	//implementar
    }
    
    public void addTeacher(Course course, Teacher teacher){
    	//implementar
    }
    
    public void rmvTeacher(Course course, Teacher teacher){
    	//implementar
    }
    
    public void rmvCourseAdministrator(Course course, CourseAdministrator courseAdm){
    	//implemetar
    }
    
    public void addCourseAdministrator(Course course, CourseAdministrator courseAdm){
    	//implementar
    }
    
    public Period addSubjectPeriod(Period period, Subject subject){
    	return null; //implementar
    }
    
    public Period rmvSubjectPeriod(Period period, Subject subject){
    	return null; //implementar
    }
    
    public Course findCourseById(Long id){
    	return null; //implementar
    }
    
    public Period findPeriodById(Long id){
    	return null; //implementar
    }
    
    public Page<Course> findCoursesByCourseAdm(Long idCourseAdm, Integer page,Integer quantityPerPage){
    	return null; //implementar
    }
    
    public Page<Course> findCoursesByTeacher(Long idTeacher, Integer page, Integer quantityPerPage){
    	return null; //implementar
    }
    
    public Page<Course> findCoursesByCourseType(Long idTeacher, Integer page, Integer quantityPerPage){
    	return null; //implementar
    }
    
    public List<Period> findAllPeriod(Long idCourse){
    	return null; //implementar
    }
    
    public Page<Course> findAllCourse(Integer page, Integer quantityPerPage){
    	return null; //implementar
    }

}
