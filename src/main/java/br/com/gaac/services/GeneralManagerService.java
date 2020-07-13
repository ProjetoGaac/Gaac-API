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
	
	 /**@author Gabriel Oliveira*/
    public GeneralManager save(GeneralManager generalManager){
        GeneralManager gm = this.generalManagerRepository.findByNameAndEmail(generalManager.getName(),generalManager.getEmail());

        if (gm == null){
            gm = this.generalManagerRepository.save(generalManager);
            return gm;
        }
        return null;
    }

    /**@author Jorge Gabriel */
    public GeneralManager update(GeneralManager generalManager){
        return this.generalManagerRepository.save(generalManager);
    }

    /**@author Felipe Duarte*/
    public void delete(GeneralManager generalManager){
    	
        this.generalManagerRepository.delete(generalManager);
        
    }

    public GeneralManager enable(GeneralManager generalManager){
        generalManager.addGeneralManagerCategory(UserCategory.GENERAL_MANAGER_COURSE.getCode());
        //salvo no banco de dados chamando repository que esse adm geral agora tem direitos de adm de curso
        generalManager = this.generalManagerRepository.save(generalManager);
        // returno pro sistema esse adm geral com essa nova funcionalidade
        return generalManager;
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