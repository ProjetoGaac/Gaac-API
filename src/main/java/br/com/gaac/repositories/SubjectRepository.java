/** Class that represents SubjectRepository
 * @author Gabriel Oliveira o terror delas
 * @version 1.0.0 */
package br.com.gaac.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gaac.domain.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject,Long> {
    
    public Subject findByCode(String code);
    
    public List<Subject> findByPeriods(Long idPeriod);
    
    public List<Subject> findByStudentPeriods(Long idStudentPeriod);
    
    public Page<Subject> findByTeachers(Long idTeacher, Pageable page);

}
