/** Interface that represents the DAO of the CourseType class 
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gaac.domain.CourseType;

@Repository
public interface CourseTypeRepository extends JpaRepository<CourseType,Long>{
	
	public CourseType findByName(String name);
	
}
