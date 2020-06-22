/** Class that represents the services of the CourseService
 * @author Gabriel Oliveira o terror delas
 * @version 1.0.0 */
package br.com.gaac.services;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import br.com.gaac.domain.Course;
import br.com.gaac.domain.CourseAdministrator;
import br.com.gaac.domain.Period;
import br.com.gaac.domain.Subject;
import br.com.gaac.domain.Teacher;
import br.com.gaac.repositories.CourseRepository;
import br.com.gaac.repositories.PeriodRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private PeriodRepository periodRepository;

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
    
    /**@author Gabriel Batista */
    public Period addSubjectPeriod(Period period, Subject subject){
        boolean isPresent = false;
		
		if(period.getSubjects()!=null) {
			
			List<Subject> subjects = new ArrayList<>();
			period.getSubjects().forEach(s -> {
                subjects.add(s);

			});
			
			for(int i=0; i < subjects.size(); i++) {
				if(subjects.get(i).getId() == subject.getId()) {
					isPresent = true;
					break;
				}
            }
            if(isPresent){
                return period;
            }else{

                period.addSubject(subject);
                period = this.periodRepository.save(period);
                return period;
            }
        }
    	return null; 
    }
    
    public Period rmvSubjectPeriod(Period period, Subject subject){
    	return null; //implementar
    }
    
    public Course findCourseById(Long id){
    	return null; //implementar
    }
    
    /**@author Gabriel Batista */
    public Period findPeriodById(Long id){
        Optional <Period> period = this.periodRepository.findById(id);
		
		if(period.isPresent()) {
			return period.get();
		}
		
		return null;
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
