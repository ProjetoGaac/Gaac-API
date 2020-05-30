/** Interface that represents the DAO of the CourseType class 
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseTypeRepository extends JpaRepository<CourseType,Long>{
	
	/** Method to return courseType from name 
	 * @param String - name
	 * @return CourseType */
	public CourseType findByName(String name);
	
}
