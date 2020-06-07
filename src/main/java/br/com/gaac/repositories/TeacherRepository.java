/** Class that represents the DAO of the Teacher Class
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

import br.com.gaac.domain.Teacher;

public class TeacherRepository extends JpaRepository<Teacher,Long> {

    public Teacher findById(Long id);

    public Page<Teacher> findByCourse(Long idCourse, Pageable page);

    public Teacher findByNameAndEmail(String name, String email);

}