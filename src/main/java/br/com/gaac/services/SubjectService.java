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
import br.com.gaac.domain.DTOs.SubjectDTO;
import br.com.gaac.repositories.SubjectRepository;
import br.com.gaac.resources.exceptions.ObjectBadRequestException;

@Service
public class SubjectService {
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	private Subject convertToSubject(SubjectDTO subject) {
		
		Subject s = new Subject();
		
		s.setCode(subject.getCode());
		s.setName(subject.getName());
		s.setMenu(subject.getMenu());
		s.setWorkload(subject.getWorkload());
		s.setAmountTime(subject.getAmountTime());
		
		if(subject.getDependencies() != null || subject.getDependencies().isEmpty()) {
			subject.getDependencies().forEach(dependencie -> {
				Subject sd = this.findById(dependencie.getId());
				if(sd == null) throw new ObjectBadRequestException("O id da dependência é inválido! " + dependencie.getId());
				s.addDependencie(sd);
			});
		}
		
		return s;
	}

	/**@author Felipe Duarte*/
    public Subject save(SubjectDTO subject){
    	
    	Subject s = this.convertToSubject(subject);
    	
    	System.out.println(s);
    	
    	Subject ss = this.subjectRepository.findByCode(s.getCode());
    	
    	if(ss != null) return null;
    	
    	return this.subjectRepository.save(s);
    }

    public Subject update(Subject subject){
        return null; //implementar
    }
    /**@author Gabriel Oliveira */
    public void delete(Subject subject){
       this.subjectRepository.delete(subject);
    }

    /**@author Felipe Duarte */
    public Subject findById(Long id){
        
    	Optional<Subject> subject = this.subjectRepository.findById(id);
    	
    	if(subject.isPresent()) {
    		return subject.get();
    	}
    	
    	return null;
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