/** Interface that represents the DAO of the Student Class
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long>{
	

	public Page<Student> findByAuthorized(Course course, Boolean authorized, Pageable page);
	
	public Student findByMatriculation(String matriculation);
	
	public Page<Student> findByCourse(Course course, Pageable page);
	
	public Long findCourseByStudent(Long idStudent); //Vai precisar escrever o comando SQL
	
}
