/** Class that represents the services of the Student Class
 * @author Gabriel Batista
 * @version 1.0.0 */
package br.com.gaac.services;

import org.springframework.data.domain.Page;

import br.com.gaac.domain.Course;
import br.com.gaac.domain.Student;
import br.com.gaac.domain.StudentPeriod;

public class StudentService {
		
	public Student save(Student student){
		return null; //implementar
	}
	
	public StudentPeriod savePeriod(StudentPeriod studentPeriod ){
		return null; //implementar	
	}
	
	public Student update(Student student ){
		return null; //implementar	
	}
	
	public StudentPeriod updatePeriod(StudentPeriod  usp, StudentPeriod osp){
		return null; //implementar	
	}
	
	public void delete(Student student){
		//implementar	
	}
	
	public void deletePeriod(StudentPeriod studentPeriod){
		//implementar	
	}
	
	public Student enable(Student student){
		return null; //implementar	
	}
	
	public Student disable(Student student){
		return null; //implementar	
	}
	
	public void authorizedStudent(Student student){
		//implementar	
	}
	
	private void sendEmail(Student student){
		//implementar	
	}
	
	public Student findById(Long idStudent){
		return null; //implementar	
	}
	
	public StudentPeriod findStudentPeriodById(Long id){
		return null; //implementar	
	}
	
	public Student findCourseByStudent(Long idStudent){
		return null; //implementar	
	}
	
	public Page<Student> findAllAuthorized(Course course, Integer page, Integer quantityPerPage){
		return null; //implementar	
	}
	
	public Page<Student> findAllStudentByCourse(Course course, Integer page, Integer quantityPerPage){
		return null; //implementar	
	}
	
	public Page<StudentPeriod> findAllStudentPeriod(Student student, Integer page, Integer quantityPerPage){
		return null; //implementar	
	}
	
	public Page<Student> findAllStudents(Integer page, Integer quantityPerPage){
		return null; //implementar	
	}
	
}