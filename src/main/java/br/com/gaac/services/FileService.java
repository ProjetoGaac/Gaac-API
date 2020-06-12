/** Class that represents the services of the File class 
 * Author of the struct 
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.services;

import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import br.com.gaac.domain.File;
import br.com.gaac.domain.Student;
import br.com.gaac.domain.Subject;
import br.com.gaac.domain.Teacher;

public class FileService {
	
	private static final String DIRECTORY_ROOT = "C:/";
	private static final String DIRECTORY = "Arquivo Gaac"; 
	

	public File upload(Teacher teacher, Subject subject, MultipartFile file) {
		return null; //implementar
	}
	
	
	public File uploadStudent(Student student, Subject subject, MultipartFile file) {
		return null; //implementar
	}
	
	public byte[] download(String name) {
		return null; //implementar
	}

	public File rename(String name, MultipartFile file) {
		return null; //implementar
	}
	
	public void delete(String name) {
		//implementar
	}
	
	public void delete(Subject subject) {
		//implementar
	}
	
	public void delete(Teacher teacher) {
		//implementar
	}
	
	public Page<File> findFilesSubject(Subject subject, Integer page, Integer quantityPerPage){
		return null; //implementar
	}

	public Page<File> findFilesTeacher(Teacher teacher, Subject subject, Integer page, Integer quantityPerPage){
		return null; //implementar
	}
	 
}
