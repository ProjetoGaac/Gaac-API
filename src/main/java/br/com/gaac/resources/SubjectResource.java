/** Class that represents the resource the of Subject class
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.gaac.domain.Subject;
import br.com.gaac.domain.DTOs.SubjectDTO;
import br.com.gaac.resources.exceptions.ObjectBadRequestException;
import br.com.gaac.services.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectResource {
	
	@Autowired
	private SubjectService subjectService;
	
	/**@author Felipe Duarte*/
	@PostMapping
    public ResponseEntity<Subject> save(@RequestBody @Valid SubjectDTO subject){
		
		Subject s = new Subject();
		s.setCode(subject.getCode());
		s.setName(subject.getName());
		s.setMenu(subject.getMenu());
		s.setWorkload(subject.getWorkload());
		s.setAmountTime(subject.getAmountTime());
		
		if(subject.getDependencies() != null || subject.getDependencies().isEmpty()) {
			subject.getDependencies().forEach(dependencie -> {
				Subject sd = this.subjectService.findById(dependencie.getId());
				if(sd == null) throw new ObjectBadRequestException("O id da dependência é inválido! " + dependencie.getId());
				s.addDependencie(sd);
			});
		}
		
		Subject ss = this.subjectService.save(s);
		
		if(ss != null) {
			return ResponseEntity.status(HttpStatus.CREATED).body(ss);
		}
		
		throw new ObjectBadRequestException("Disciplina Já Cadastrada!");
    }

	@PutMapping
    public ResponseEntity<Subject> update(@RequestBody @Valid SubjectDTO subject){
        return null; //implementar
    }

	@DeleteMapping
    public ResponseEntity<?> delete(@RequestBody Subject subject){
        return null; //implementar
    }

	/**@author Felipe Duarte*/
    public Subject findById(Long id){
        
    	Subject subject = this.subjectService.findById(id);
        
    	if(subject != null) {
    		return subject;
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

    @GetMapping
    public ResponseEntity<Page<Subject>> findAll(
    		@RequestParam(defaultValue = "0") Integer page, 
    		@RequestParam(defaultValue = "3") Integer quantityPerPage){
        return null; //implementar
    }
    
}