/** Class that represents PeriodRepository
 * @author Gabriel Oliveira o terror delas
 * @version 1.0.0 */
package br.com.gaac.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gaac.domain.Course;
import br.com.gaac.domain.Period;

@Repository
public interface PeriodRepository extends JpaRepository<Period,Long> {
    
    public List<Period> findByCourse(Course course);
    
}
