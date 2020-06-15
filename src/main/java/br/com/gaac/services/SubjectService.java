/** Class that represents the services of the Subject Class
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import br.com.gaac.domain.Subject;
import br.com.gaac.repositories.SubjectRepository;

@Service
public class SubjectService {
	
	@Autowired
	private SubjectRepository subjectRepository;

	/**@author Felipe Duarte*/
    public Subject save(Subject subject){
    	
    	Subject s = this.subjectRepository.findByCode(subject.getCode());
    	
    	if(s == null) {
    		subject = this.subjectRepository.save(subject);
    		return subject;
    	}
    	
    	return null;
    }

    public Subject update(Subject subject){
        return null; //implementar
    }

    public void delete(Subject subject){
        //implementar
    }

    /**@author Felipe Duarte */
    public Subject findById(Long id){
        
    	Optional<Subject> subject = this.subjectRepository.findById(id);
    	
    	if(subject.isPresent()) {
    		return subject.get();
    	}
    	
    	return null;
    }

    public List<Subject> findSubjectsByPeriod(Long idPeriod){
        return null; //implementar
    }

    public Page<Subject> findSubjectsByTeacher(Long idTeacher, Integer page, Integer quantityPerPage){
        return null; //implementar
    }

    public List<Subject> findSubjectsByStudentPeriod(Long idStudentPeriod){
        return null; //implementar
    }

    public Page<Subject> findAll(Integer page, Integer quantityPerPage){
        return null; //implementar
    }
    
}