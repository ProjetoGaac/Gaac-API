/** Class that represents CourseRepository
 * @author Gabriel Oliveira o terror delas
 * @version 1.0.0 */
package br.com.gaac.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gaac.domain.Course;

@Repository
public interface CourseRepository  extends JpaRepository<Course,Long> {
	
    public Course findByCode(String code);
    
    public Page<Course> findByCourseAdministrators(Long idCourseAdm, Pageable page);
    
    public Page<Course> findByCourseType(Long idCourseType, Pageable page);
    
    public Page<Course> findByTeachers(Long idTeacher, Pageable page);
}
