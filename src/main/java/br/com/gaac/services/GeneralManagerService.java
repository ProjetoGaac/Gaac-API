/** Class that represents the services of the General Manager Class
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import br.com.gaac.domain.GeneralManager;
import br.com.gaac.domain.Enums.UserCategory;
import br.com.gaac.repositories.GeneralManagerRepository; 
 
@Service
public class GeneralManagerService {

	@Autowired
	private GeneralManagerRepository generalManagerRepository;
	
	 /**@author Gabriel Oliveira*/
    public GeneralManager save(GeneralManager generalManager){
        GeneralManager gm = this.generalManagerRepository.findByNameAndEmail(generalManager.getName(),generalManager.getEmail());

        if (gm == null){
        	generalManager.addGeneralManagerCategory(UserCategory.GENERAL_MANAGER.getCode());
            gm = this.generalManagerRepository.save(generalManager);
            return gm;
        }
        return null;
    }

    /**@author Jorge Gabriel */
    public GeneralManager update(GeneralManager generalManager){
    	
    	Optional<GeneralManager> gm = this.generalManagerRepository.findById(generalManager.getId());
    	
    	if(gm.isPresent()) {
    		
    		return this.generalManagerRepository.save(generalManager);
    	
    	}
    	
        return null;
    }

    /**@author Felipe Duarte*/
    public void delete(GeneralManager generalManager){
    	
        this.generalManagerRepository.delete(generalManager);
        
    }

    /**@author Gabriel Oliveira*/
    public GeneralManager enable(Long id){
    	
    	Optional<GeneralManager> gm = this.generalManagerRepository.findById(id);
        
    	if(gm.isPresent()) {
    		gm.get().addGeneralManagerCategory(UserCategory.GENERAL_MANAGER_COURSE.getCode());
    		
            return this.generalManagerRepository.save(gm.get());
    	}
    	
        return null;
    }

    /**@author Felipe Duarte*/
    public GeneralManager disable(Long id){
    	
    	Optional<GeneralManager> gm = this.generalManagerRepository.findById(id);
    	
    	if(gm.isPresent()) {
    		gm.get().rmvGeneralManagerCategory(UserCategory.GENERAL_MANAGER_COURSE.getCode());
    		
    		this.generalManagerRepository.save(gm.get());
    		
    		return gm.get();
    	}
    	
    	return null;
    }
    
    /**@author Gabriel Batista */
    public Page<GeneralManager> findAll(Integer page, Integer quantityPerPage){
        PageRequest pageRequest = PageRequest.of(page, quantityPerPage);
    	
    	Page<GeneralManager> generalManagers = this.generalManagerRepository.findAll(pageRequest);
    	
    	if(!generalManagers.getContent().isEmpty()) {
    		return generalManagers;
    	}
    	
    	return null;
    }
    
}