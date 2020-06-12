/** Class that represents the DAO of the Course Administrator Class
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gaac.domain.CourseAdministrator;

@Repository
public interface CourseAdministratorRepository extends JpaRepository<CourseAdministrator,Long> {

    public Page<CourseAdministrator> findByCourse(Long idCourse,Pageable page);

    public CourseAdministrator findByNameAndEmail(String name, String email);
    
}