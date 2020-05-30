/** Class that represents the services of the Teacher class
 * Author of the Struct
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.service;

import java.util.List;

import org.springframework.data.domain.Page;

import br.com.gaac.domain.Subject;

public class TeacherService {
	
	/** Method to save a Teacher
	 * @param Teacher - teacher
	 * @return Teacher */
	public Teacher save(Teacher teacher) {
		return null; //implementar
	}
	
	/** Method to update a Teacher 
	 * @param Teacher - teacher
	 * @return Teacher */
	public Teacher update(Teacher teacher) {
		return null; //implementar
	}
	
	/** Method to delete a Teacher
	 * @param Teacher - teacher
	 * @return void */
	public void delete(Teacher teacher) {
		//implementar
	}
	
	/** Method to enable Teacher to TEACHER_ADMINISTRATOR 
	 * @param Teacher - teacher 
	 * @return Teacher */
	public Teacher enable(Teacher teacher) {
		return null; //implementar
	}
	
	/** Method to disable Teacher of the TEACHER_ADMINISTRATOR 
	 * @param Teacher teacher 
	 * @return Teacher */
	public Teacher disable(Teacher teacher) {
		return null; //implementar
	}

	/** Method to add Subject to Teacher 
	 * @param Teacher - Teacher 
	 * @param List<Course> - courses 
	 * @param Subject - subject 
	 * @return Teacher */
	public Teacher addSubject(Teacher teacher, List<Course> courses, Subject subject) {
		return null; //implementar
	}
	
	/** Method to remove Subject of the Teacher 
	 * @param Teacher - teacher 
	 * @param Subject - subject 
	 * @return Teacher */
	public Teacher rmvSubject(Teacher teacher, Subject subject) {
		return null; //implementar
	}
	
	/** Method to find a teacher from id 
	 * @param Long - id 
	 * @return Teacher */
	public Teacher findById(Long id) {
		return null; //implementar
	}
	
	/** Method to find teachers of the a course 
	 * @param Long - idCourse
	 * @param Integer - page 
	 * @param Integer - quantityPerPage 
	 * @return Page<Teacher> */
	public Page<Teacher> findTeacherByCourse(Long idCourse, Integer page, Integer quantityPerPage){
		return null; //implementar
	}
	
	/** Method to find all teachers 
	 * @param Integer - page 
	 * @param Integer - quantityPerPage 
	 * @return Page<Teacher> */
	public Page<Teacher> findAll(Integer page, Integer quantityPerPage){
		return null; //implementar
	}
	
}
