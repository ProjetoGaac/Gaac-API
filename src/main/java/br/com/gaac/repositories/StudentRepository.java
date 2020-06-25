/** Interface that represents the DAO of the Student Class
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.gaac.domain.Course;
import br.com.gaac.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

	public Page<Student> findByAuthorized(Course course, Boolean authorized, Pageable page);
	
	public Student findByMatriculation(String matriculation);

	public Student findByEmail(String email);
	
	public Page<Student> findByCourse(Course course, Pageable page);
	
	
	/* Problemas
	@Query(value = "SELECT s.course FROM student s WHERE s.id = 1")
	public Course findByCourse(Long idStudent);*/
	
}
