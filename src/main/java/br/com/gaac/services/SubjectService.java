/** Class that represents the services of the Subject Class
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import br.com.gaac.domain.Subject;
import br.com.gaac.domain.Teacher;
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
    /**@author Gabriel Oliveira */
    public boolean delete(Long id){
      Subject subject = this.findById(id);
      
      if(subject == null) return false;
      		
      this.subjectRepository.delete(subject);
      return true;
      
    }

    /**@author Felipe Duarte */
    public Subject findById(Long id){
        
    	Optional<Subject> subject = this.subjectRepository.findById(id);
    	
    	if(!subject.isPresent()) return null;
   
    	return subject.get();
    }
    /**@author Gabriel Oliveira */
    public List<Subject> findSubjectsByPeriod(Long idPeriod){
        List<Subject> listSub = this.subjectRepository.findByStudentPeriods(idPeriod);
        
        if(listSub != null) {
        	return listSub;
        }
        return null;
    }

    public Page<Subject> findSubjectsByTeacher(Teacher teacher, Integer page, Integer quantityPerPage){
        return null; //implementar
    }

    /**@author Jorge Gabriel */
    public List<Subject> findSubjectsByStudentPeriod(Long idStudentPeriod){
        
        List<Subject> subject = this.subjectRepository.findByStudentPeriods(idStudentPeriod);
    	
    	if(!subject.isEmpty()) {
    		return subject;
    	}
    	
    	return null;
    }

    /**@author Jorge Gabriel */
    public Page<Subject> findAll(Integer page, Integer quantityPerPage){
        
        PageRequest pageRequest = PageRequest.of(page, quantityPerPage);
    	
    	Page<Subject> subjects = this.subjectRepository.findAll(pageRequest);
    	
    	if(!subjects.getContent().isEmpty()) {
    		return subjects;
    	}
    	
    	return null;
    }
    
}