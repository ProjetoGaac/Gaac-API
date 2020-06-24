/** Class that represents the services of the Teacher class
 * Author of the Struct
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import br.com.gaac.domain.Course;
import br.com.gaac.domain.Subject;
import br.com.gaac.domain.Teacher;
import br.com.gaac.domain.Enums.UserCategory;
import br.com.gaac.repositories.TeacherRepository;

@Service
public class TeacherService {
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	/**@author Felipe Duarte*/
	public Teacher save(Teacher teacher) {
		
		Teacher t = this.teacherRepository.findByNameAndEmail(teacher.getName(), 
				teacher.getEmail());
		
		if(t == null) {
			teacher.addTeacherCategory(UserCategory.TEACHER.getCode());
			//Aqui tem que encriptar a senha
			t = this.teacherRepository.save(teacher);
			return t;
		}
		
		return null;
	}
	
	public Teacher update(Teacher teacher) {
		return null; //implementar
	}
	
	public void delete(Teacher teacher) {
		//implementar
	}
	
	public Teacher enable(Teacher teacher) {
		return null; //implementar
	}
	
	public Teacher disable(Teacher teacher) {
		return null; //implementar
	}
	
	/**@author Felipe Duarte*/
	public Teacher addSubject(Teacher teacher, List<Course> courses, Subject subject) {
		
		boolean isPresent = false;
		
		if(!courses.isEmpty()) {
			
			List<Subject> subjects = new ArrayList<>();
			courses.forEach(course -> {
				course.getPeriods().forEach(period -> {
					period.getSubjects().forEach(s -> {
						subjects.add(s);
					});
				});
			});
			
			for(int i=0; i < subjects.size(); i++) {
				if(subjects.get(i).getId() == subject.getId()) {
					isPresent = true;
					break;
				}
			}
			 
			if(isPresent) {
				
				boolean isAdd = false;
				
				for(int i=0; i < teacher.getSubjects().size(); i++) {
					if(teacher.getSubjects().get(i).getId() == subject.getId()) {
						isAdd = true;
					}
				}
				
				if(!isAdd) {
					teacher.addSubject(subject);
					teacher = this.teacherRepository.save(teacher);
					return teacher;
				}else {
					teacher = null;
					return teacher;
				}
				
			}else {
				teacher.setSubjects(null);
				return teacher;
			}
			
		}else {
			teacher.setCourses(null);
			return teacher;
		}
		
	}
	/**@author Gabriel Batista */
	public Teacher rmvSubject(Teacher teacher, Subject subject) {

		boolean isPresent = false;
					
		List<Subject> subjects = new ArrayList<>();
		teacher.getSubjects().forEach(s -> {
					subjects.add(s);
		});
		
		for(int i=0; i < subjects.size(); i++) {
			if(subjects.get(i).getId() == subject.getId()) {
				isPresent = true;
				break;
			}
		}

		if(!isPresent){
			return null; //implementar
		}else{
			teacher.rmvSubject(subject);
			teacher = this.teacherRepository.save(teacher);
			return(teacher);
		}	
	}
	
	/**@author Felipe Duarte*/
	public Teacher findById(Long id) {
		
		Optional<Teacher> teacher = this.teacherRepository.findById(id);
		
		if(teacher.isPresent()) {
			return teacher.get();
		}
		
		return null;
	}

	public Page<Teacher> findTeacherByCourse(Long idCourse, Integer page, Integer quantityPerPage){
		return null; //implementar
	}

	public Page<Teacher> findAll(Integer page, Integer quantityPerPage){
		return null; //implementar
	}
	
}
