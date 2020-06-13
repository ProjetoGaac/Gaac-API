package br.com.gaac.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gaac.domain.Student;
import br.com.gaac.domain.StudentPeriod;

@Repository
public interface StudentPeriodRepository extends JpaRepository<StudentPeriod,Long>{
	
	public Page<StudentPeriod> findByStudent(Student student, Pageable page);
	
	public StudentPeriod findByNumberAndStudent(Integer number, Student student);
	
}
