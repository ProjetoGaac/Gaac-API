/** Class that represents the DAO of the File Class
 * @author Gabriel Batista
 * @version 1.0.0 */
package br.com.gaac.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gaac.domain.File;
import br.com.gaac.domain.Subject;
import br.com.gaac.domain.Teacher;

@Repository
public interface FileRepository extends JpaRepository<File,Long>{
    
    public  File findByName(String name);
    
    public  Page<File> findBySubject(Subject subject, Pageable page);
    
    public  List<File> findByTeacher(Teacher teacher);
    
    public  File findBySubjectAndName(Subject subject, String name);
    
    public  Page<File> findByTeacherAndSubject(Subject subject, Teacher teacher, Pageable page);
    
    public  File findByTeacherAndSubjectAndName(Teacher teacher, Subject subject, String name);

}