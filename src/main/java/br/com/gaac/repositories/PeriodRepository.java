package br.com.gaac.repositories;

import br.com.gaac.domain.Period;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface PeriodRepository extends JpaRepository<PeriodRepository,Long> {
    public Period findById(Long id);
    public ArrayList<Period> findByCourse(Course course);
}
