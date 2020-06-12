/** Class that represents Subject
 * @author Gabriel Oliveira o terror delas
 * @version 1.0.0 */
package br.com.gaac.repositories;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gaac.domain.Course;

public interface CourseRepository  extends JpaRepository<Course,Long> {
    public Course findByCode(String code);
    public Page<Course> findByCourseAdm(Long idCourseAdm, Pageable page);
    public Page<Course> findByCourseType(Long idCourseType,Pageable page);
    public Page<Course> findByTeacher(Long idTeacher, Pageable page);
}
