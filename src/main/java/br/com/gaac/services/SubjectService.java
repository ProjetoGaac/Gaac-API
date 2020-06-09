/** Class that represents the services of the Subject Class
 * @author Jorge Gabriel
 * @version 1.0.0 */


package br.com.gaac.services;

import org.springframework.data.domain.Page;

import java.util.List;

import br.com.gaac.domain.Subject;
import br.com.gaac.domain.Period;
import br.com.gaac.domain.Teacher;
import br.com.gaac.domain.StudentPeriod; 

public class SubjectService {

    public Subject save(Subject subject){
        return null; //implementar
    }

    public Subject update(Subject subject){
        return null; //implementar
    }

    public void delete(Subject subject){
        //implementar
    }

    public Subject findById(Long id){
        return null; //implementar
    }

    public ArrayList<Subject> findSubjectsByPeriod(Long idPeriod){
        return null; //implementar
    }

    public Page<Subject> findSubjectsByTeacher(Long idTeacher, Integer page, Integer quantityPerPage){
        return null; //implementar
    }

    public ArrayList<Subject> findSubjectsByStudentPeriod(Long idStudentPeriod){
        return null; //implementar
    }

    public Page<Subject> findAll(Integer page, Integer quantityPerPage){
        return null; //implementar
    }

    
}