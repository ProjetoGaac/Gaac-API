package br.com.gaac.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gaac.domain.Course;
import br.com.gaac.domain.Period;

public interface PeriodRepository extends JpaRepository<Period,Long> {
    
    public List<Period> findByCourse(Course course);
}
