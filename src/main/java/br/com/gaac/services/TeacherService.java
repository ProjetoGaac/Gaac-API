/** Class that represents the services of the Teacher class
 * Author of the Struct
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.services;

import java.util.List;

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

	public Teacher addSubject(Teacher teacher, List<Course> courses, Subject subject) {
		return null; //implementar
	}
	
	public Teacher rmvSubject(Teacher teacher, Subject subject) {
		return null; //implementar
	}

	public Teacher findById(Long id) {
		return null; //implementar
	}

	public Page<Teacher> findTeacherByCourse(Long idCourse, Integer page, Integer quantityPerPage){
		return null; //implementar
	}

	public Page<Teacher> findAll(Integer page, Integer quantityPerPage){
		return null; //implementar
	}
	
}
