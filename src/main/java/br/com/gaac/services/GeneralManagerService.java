/** Class that represents the services of the General Manager Class
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.services;

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
	
    public GeneralManager save(GeneralManager generalManager){
        return null;  //implementar
    }

    public GeneralManager update(GeneralManager generalManager){
        return null; //implementar
    }

    /**@author Felipe Duarte*/
    public void delete(GeneralManager generalManager){
    	
        this.generalManagerRepository.delete(generalManager);
        
    }

    public GeneralManager enable(GeneralManager generalManager){
        return null; //implementar
    }

    /**@author Felipe Duarte*/
    public GeneralManager disable(GeneralManager generalManager){
    	
    	generalManager.rmvGeneralManagerCategory(UserCategory.GENERAL_MANAGER_COURSE.getCode());
    	
    	generalManager = this.generalManagerRepository.save(generalManager);
    	
    	return generalManager;
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