/** Class that represents the resource the of Subject class
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.resources;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.gaac.domain.Subject;
import br.com.gaac.domain.DTOs.SubjectDTO;

@RestController
public class SubjectResource {

    public ResponseEntity<Subject> save(SubjectDTO subject){
        return null; //implementar
    }

    public ResponseEntity<Subject> update(SubjectDTO subject){
        return null; //implementar
    }

    public ResponseEntity<?> delete(Subject subject){
        return null; //implementar
    }

    public Subject findById(Long id){
        return null; //implementar
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

    public ResponseEntity<Page<Subject>> findAll(Integer page, Integer quantityPerPage){
        return null; //implementar
    }
    
}