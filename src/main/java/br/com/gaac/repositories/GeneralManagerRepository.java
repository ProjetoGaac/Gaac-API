/** Class that represents the DAO of the General Manager Class
 * @author Gabriel Batista
 * @version 1.0.0 */
package br.com.gaac.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneralManagerRepository extends JpaRepository<GeneralManager,Long>{
	
	public GeneralManager findByNameAndEmail(String name, String Email);
	
}