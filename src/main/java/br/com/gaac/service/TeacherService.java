/** Class that represents the services of the Teacher class
 * Author of the Struct
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.service;

import java.util.List;

import org.springframework.data.domain.Page;

import br.com.gaac.domain.Subject;

public class TeacherService {
	
	public Teacher save(Teacher teacher) {
		return null; //implementar
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
