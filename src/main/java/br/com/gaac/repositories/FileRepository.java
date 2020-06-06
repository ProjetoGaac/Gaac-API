/** Class that represents the DAO of the File Class
 * @author Gabriel Batista
 * @version 1.0.0 */
package br.com.gaac.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gaac.domain.File;

public interface FileRepository extends JpaRepository<File,Long>{
	
	//Revisar os nomes dos metodos e os tipos dos parametros
	
    public File findByName(String name);

    public Page<File> findBySubject(String subject, Pageable page);

    public List<File> findByTeacher(String teacher);
	
    public File findByNameAndSubject(String teacher, String subject);

    public Page<File> findBySubjectAndName(String subject, String name, Pageable page);
    
    public File findByTeacherAndSubjectAndName(String teacher, String subject, String name);

    
	
}