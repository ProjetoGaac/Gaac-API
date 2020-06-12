/** Class that represents the resource the GeneralManagerResource
 * Author of the Struct
 * @author Gabriel Oliveira o terror delas
 * @version 1.0.0 */

package br.com.gaac.resources;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.gaac.domain.GeneralManager;

@RestController
public class GeneralManagerResource {
	
    public ResponseEntity<GeneralManager> save(GeneralManager generalManager){
        return null;
    }
    
    public ResponseEntity<GeneralManager> update(GeneralManager generalManager){
        return null;
    }
    
    public ResponseEntity<?> delete(GeneralManager generalManager){
        return null;
    }
    
    public ResponseEntity<GeneralManager> enable(GeneralManager generalManager){
        return null;
    }
    
    public ResponseEntity<GeneralManager> disable(GeneralManager generalManager){
        return null;
    }
    
    public ResponseEntity<Page<GeneralManager>> findAll(Integer page, Integer quantityPerPage){
        return null;
    }

}
