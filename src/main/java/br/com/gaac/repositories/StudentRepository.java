/** Interface that represents the DAO of the Student Class
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long>{
	
	/** Method to return a student page waiting to be 
	 * accepted into the system
	 * @param Course - course
	 * @param Boolean - authorized
	 * @param Pageable - page
	 * @return Page<Student>*/
	public Page<Student> findByAuthorized(Course course, Boolean authorized, Pageable page);
	
	/** Method to return a student from matriculation 
	 * @param String - matriculation
	 * @return Student*/
	public Student findByMatriculation(String matriculation);
	
	/** Method to return a student page from the course 
	 * @param Course - course
	 * @param Pageable - page
	 * @return Page<Student> */
	public Page<Student> findByCourse(Course course, Pageable page);
	
	/** Method to return a student's course id 
	 * @param Long - idStudent
	 * @return Long - idCourse*/
	public Long findCourseByStudent(Long idStudent); //Vai precisar escrever o comando SQL
	
}
