package br.com.gaac.repositories;

import br.com.gaac.domain.Subject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface SubjectRepository extends JpaRepository<SubjectRepository,Long> {
    public Subject findById(Long id);
    public Subject findByCode(String code);
    public ArrayList<Subject> findByPeriod(Long idPeriod);
    public ArrayList<Subject> findByStudentPeriod(Long idStudentPeriod);
    public Page<Subject> findByTeacher(Long idTeacher, Pageable page);

}
