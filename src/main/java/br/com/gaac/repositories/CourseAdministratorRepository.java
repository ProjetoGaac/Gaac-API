/** Class that represents the DAO of the Course Administrator Class
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

import br.com.gaac.domain.CourseAdministrator;

public class CourseAdministratorRepository extends JpaRepository<CourseAdministrator,Long> {

    public CourseAdministrator findById(Long id);

    public Page<CourseAdministrator> findByCourse(Long idCourse,Pageable page);

    public CourseAdministrator findByNameAndEmail(String name, String email);



    
}