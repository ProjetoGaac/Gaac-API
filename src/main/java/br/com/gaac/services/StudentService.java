/** Class that represents the services of the Student Class
 * @author Gabriel Batista
 * @version 1.0.0 */
package br.com.gaac.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import br.com.gaac.domain.Course;
import br.com.gaac.domain.Student;
import br.com.gaac.domain.StudentPeriod;
import br.com.gaac.repositories.StudentPeriodRepository;
import br.com.gaac.repositories.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private StudentPeriodRepository studentPeriodRepository;
	
	/**@author Gabriel Batista */
	public Student save(Student student){
		Student s = this.studentRepository.findByMatriculation(student.getMatriculation());

		if(s == null) {
			s = this.studentRepository.save(student);
			return s;
		}
		return null;
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
	/**@author Gabriel Batista */
	public void delete(Student student){
		this.studentRepository.delete(student);
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
	/**@author Gabriel Batista */
	public Student findByMatriculation(String matriculation){
		Student s = this.studentRepository.findByMatriculation(matriculation);
		

		if(s != null) {
			return s;
		}
		return null;	
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