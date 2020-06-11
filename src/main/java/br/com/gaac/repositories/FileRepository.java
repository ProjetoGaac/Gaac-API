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


    public  File save( File file );
    
    public  File update( File file );
    
    public  void delete( File file );
    
    public  File findByName( String name );
    
    public  Page<File> findBySubject( Pageable  page , Subject subject );
    
    public  ArrayList<File> findByTeacher( Teacher teacher );
    
    public  File findBySubjectAndName( String  name , Subject subject );
    
    public  Page<File> findByTeacherAndSubject( Pageable  page , Subject  subject , Teacher teacher );
    
    public  File findByTeacherAndSubjectAndName( String  name , Subject  subject , Teacher teacher );

    
	
}