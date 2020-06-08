package br.com.gaac.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface CourseRepository  extends JpaRepository<CourseRepository,Long> {
    public Course findById(Long id);
    public Course findByCode(String code);
    public Page<Course> findByCourseAdm(Long idCourseAdm, Pageable page);
    public Page<Course> findByCourseType(Long idCourseType,Pageable page);
    public Page<Course> findByTeacher(Long idTeacher, Pageable page);
}
