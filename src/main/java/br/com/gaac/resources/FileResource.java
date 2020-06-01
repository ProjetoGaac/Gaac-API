/** Class that represents the resource the of File class
 * Author of the Struct
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.resources;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import br.com.gaac.domain.Subject;
import br.com.gaac.service.FileService;

public class FileResource {
	
	public ResponseEntity<File> upload(Long idTeacher, Long idSubject, MultipartFile file){
		return null; //implementar
	}
	
	public ResponseEntity<File> uploadStudent(Long idStudent, Long idSubject, MultipartFile file){
		return null; //implementar
	}
	
	public HttpEntity<byte[]> download(String name){
		return null; //implementar
	}
	
	public ResponseEntity<File> rename(String name, MultipartFile file){
		return null; //implementar
	}
	
	public ResponseEntity<?> delete(String name){
		return null; //implemetar
	}
	
	public void delete(Subject subject){
		return null; //implemetar
	}
	
	public void delete(Teacher teacher){
		return null; //implemetar
	}
	
	
	public ResponseEntity<Page<File>> findFilesSubject(Long idSubject, Integer page, 
			Integer quantityPerPage){
		return null; //implementar
	}
	
	
	public ResponseEntity<Page<File>> findFilesTeacher(Long idTeacher, Integer page, 
			Integer quantityPerPage){
		return null; //implementar
	}
	
}
