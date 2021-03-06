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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.gaac.domain.Subject;
import br.com.gaac.domain.Teacher;
import br.com.gaac.domain.DTOs.SubjectDTO;
import br.com.gaac.resources.exceptions.ObjectBadRequestException;
import br.com.gaac.resources.exceptions.ObjectNotFoundException;
import br.com.gaac.services.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectResource {

	@Autowired
	private SubjectService subjectService;

	/** @author Felipe Duarte */
	@PostMapping
	public ResponseEntity<Subject> save(@RequestBody @Valid SubjectDTO subject) {

		Subject s = this.subjectService.save(subject);

		if (s == null) {
			throw new ObjectBadRequestException("Disciplina Já Cadastrada!");
		}

		return ResponseEntity.status(HttpStatus.CREATED).body(s);
	}

	@PutMapping
	public ResponseEntity<Subject> update(@RequestBody @Valid SubjectDTO subject) {
		Subject s = this.subjectService.update(subject);

		if (s == null) {
			throw new ObjectNotFoundException("Nenhuma 'materia' encontrado com esta ID!");

		}
		return ResponseEntity.status(HttpStatus.OK).body(s);


	}

	/**@author Gabriel Oliveira */
	@DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
		boolean resp = this.subjectService.delete(id);
		
		if(resp == false) {
			throw new ObjectNotFoundException("Nenhuma disciplina encontrada no sistema!");
		}
		return ResponseEntity.status(HttpStatus.OK).build();
    }

	/**@author Felipe Duarte*/
    public Subject findById(Long id){
        
    	Subject subject = this.subjectService.findById(id);
        
    	if(subject == null) return null;
    	
    	return subject;
    }
    /**@author Gabriel Oliveira */
    public List<Subject> findSubjectsByPeriod(Long idPeriod){
        //armazenando em uma variavel listSub o id do periodo da disciplina e verifica se esse id capturado é nulo ou não  
    	List<Subject> listSub = this.subjectService.findSubjectsByPeriod(idPeriod);
        
        if(listSub == null) {
        	 return null;	
        }
        
        return listSub;
       
    }

    /** @author Jorge Gabriel */
    public Page<Subject> findSubjectsByTeacher(Teacher teacher, Integer page, Integer quantityPerPage) {
        Page<Subject> subjects = this.subjectService.findSubjectsByTeacher(teacher, page, quantityPerPage);

        if (subjects == null) {
            throw new ObjectNotFoundException("Nenhum Professor encontrado!");
        }

        return subjects;
    }

	/**@author Jorge Gabriel */
	public List<Subject> findSubjectsByStudentPeriod(Long idStudentPeriod){
        List<Subject> subject = this.subjectService.findSubjectsByStudentPeriod(idStudentPeriod);
        
    	if(subject == null) return null;	
    	
    	return subject;
        
    	
    }

	/**@author Jorge Gabriel */
    @GetMapping
    public ResponseEntity<Page<Subject>> findAll(
    		@RequestParam(defaultValue = "0") Integer page, 
    		@RequestParam(defaultValue = "3") Integer quantityPerPage){
			
				Page<Subject> subjects = this.subjectService.findAll(page, quantityPerPage);
    	
				if(subjects == null) {
					throw new ObjectNotFoundException("Nenhuma Disciplina encontrada!");
				}
				return ResponseEntity.status(HttpStatus.OK).body(subjects);
    
	}

	

	

	

	
	

}