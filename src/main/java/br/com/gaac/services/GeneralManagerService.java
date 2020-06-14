/** Class that represents the services of the General Manager Class
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import br.com.gaac.domain.GeneralManager;
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

    public GeneralManager disable(GeneralManager generalManager){
        return null;  //implementar
    }
    
    public Page<GeneralManager> findAll(Integer page, Integer quantityPerPage){
        return null; //implementar
    }
    
}