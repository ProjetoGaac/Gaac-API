/** Class that represents the resource the GeneralManagerResource
 * Author of the Struct
 * @author Gabriel Oliveira o terror delas
 * @version 1.0.0 */

package br.com.gaac.resources;

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

import br.com.gaac.domain.GeneralManager;
import br.com.gaac.resources.exceptions.ObjectNotFoundException;
import br.com.gaac.resources.exceptions.ObjectBadRequestException;
import br.com.gaac.services.GeneralManagerService;

@RestController
@RequestMapping("/generalManager")
public class GeneralManagerResource {
	
	@Autowired
	private GeneralManagerService generalManagerService;
	
	/**@author Gabriel Oliveira */
	@PostMapping
    public ResponseEntity<GeneralManager> save(@RequestBody @Valid GeneralManager generalManager) {
        generalManager = this.generalManagerService.save(generalManager);
        if(generalManager != null){
        	return ResponseEntity.status(HttpStatus.CREATED).body(generalManager);
		}
        throw new ObjectBadRequestException("General Manager already exists!");
    }
    
	@PutMapping
    public ResponseEntity<GeneralManager> update(@RequestBody @Valid GeneralManager generalManager){
        return null;
    }
    
	/**@author Felipe Duarte*/
	@DeleteMapping
    public ResponseEntity<?> delete(@RequestBody GeneralManager generalManager){
        
		this.generalManagerService.delete(generalManager);
		
		return ResponseEntity.status(HttpStatus.OK).build();
		
    }
    
	@PutMapping("/enable")
    public ResponseEntity<GeneralManager> enable(@RequestBody @Valid GeneralManager generalManager){
        return null;
    }
    
	/**@author Felipe Duarte*/
	@PutMapping("/disable")
    public ResponseEntity<GeneralManager> disable(@RequestBody @Valid GeneralManager generalManager){
        
		if(generalManager.getId() == null) {
			throw new ObjectBadRequestException("Falta o id de generalManager");
		}
		
		generalManager = this.generalManagerService.disable(generalManager);
		
		return ResponseEntity.status(HttpStatus.OK).body(generalManager);
    }
	
	/**@author Gabriel Batista */
	@GetMapping
    public ResponseEntity<Page<GeneralManager>> findAll(
    		@RequestParam(defaultValue = "0") Integer page, 
    		@RequestParam(defaultValue = "3") Integer quantityPerPage){
				Page<GeneralManager> generalManagers = this.generalManagerService.findAll(page, quantityPerPage);
    	
				if(generalManagers != null) {
					return ResponseEntity.status(HttpStatus.OK).body(generalManagers);
				}
				
				throw new ObjectNotFoundException("Nenhum 'Administrador geral' encontrado!");
    }

}
