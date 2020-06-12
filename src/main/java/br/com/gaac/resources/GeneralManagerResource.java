/** Class that represents the resource the GeneralManagerResource
 * Author of the Struct
 * @author Gabriel Oliveira o terror delas
 * @version 1.0.0 */

package br.com.gaac.resources;

import br.com.gaac.domain.GeneralManager;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

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
