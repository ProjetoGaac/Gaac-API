/** Class that represents the services of the Student Class
 * @author Gabriel Batista
 * @version 1.0.0 */
package br.com.gaac.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public class StudentService {
		
	public  Student save( Student student ){
		return null; //implementar
	}
	
	public  StudentPeriod savePeriod( StudentPeriod studentPeriod ){
		return null; //implementar	
	}
	
	public  Student update( Student student ){
		return null; //implementar	
	}
	
	public  StudentPeriod updatePeriod( StudentPeriod  osp , StudentPeriod usp ){
		return null; //implementar	
	}
	
	public  void delete( StudentResource student ){
		return null; //implementar	
	}
	
	public  void deletePeriod( StudentPeriod studentPeriod ){
		return null; //implementar	
	}
	
	public  Student enable( Student student ){
		return null; //implementar	
	}
	
	public  Student disable( Student student ){
		return null; //implementar	
	}
	
	public  void authorizedStudent( Student student ){
		return null; //implementar	
	}
	
	public  void sendEmail( Student student ){
		return null; //implementar	
	}
	
	public  Student findById( Long idStudent ){
		return null; //implementar	
	}
	
	public  StudentPeriod findStudentPeriodById( Long id ){
		return null; //implementar	
	}
	
	public  Student findCourseByStudent( Long idStudent ){
		return null; //implementar	
	}
	
	public  Page<Student> findAllAuthorized( Integer  quantityPerPage , Integer  page , Course course ){
		return null; //implementar	
	}
	
	public  Page<Student> findAliStudentByCourse( Integer  quantityPerPage , Integer  page , Course course ){
		return null; //implementar	
	}
	
	public  Page<StudentPeriod> findAlIiStudentPeriod( Integer  quantityPerPage , Integer  page , Student student ){
		return null; //implementar	
	}
	
	public  Page<Student> findAliStudents( Integer  quantityPerPage , Integer page ){
		return null; //implementar	
	}
	
}