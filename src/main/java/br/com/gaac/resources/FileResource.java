/** Class that represents the resource the of File class
 * Author of the Struct
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.com.gaac.domain.File;
import br.com.gaac.domain.Subject;
import br.com.gaac.domain.Teacher;
import br.com.gaac.services.FileService;

@RestController
@RequestMapping("/file")
public class FileResource {
	
	@Autowired
	private SubjectResource subjectResource;
	
	@Autowired
	private TeacherResource teacherResource;
	
	@Autowired
	private FileService fileService;
	
	@PostMapping("/upload/teacher")
	public ResponseEntity<File> upload(@RequestParam Long idTeacher, @RequestParam Long idSubject, 
			@RequestParam MultipartFile file){
		return null; //implementar
	}
	
	@PostMapping("/upload/student")
	public ResponseEntity<File> uploadStudent(@RequestParam Long idStudent, @RequestParam Long idSubject, 
			@RequestParam MultipartFile file){
		return null; //implementar
	}
	
	@GetMapping("/download")
	public HttpEntity<byte[]> download(@RequestParam String name){
		return null; //implementar
	}
	
	@PutMapping
	public ResponseEntity<File> rename(@RequestParam String name, @RequestParam MultipartFile file){
		return null; //implementar
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestParam String name){
		return null; //implementar
	}
	
	public void delete(Subject subject){
		//implementar
	}
	
	public void delete(Teacher teacher){
		//implementar
	}
	
	@GetMapping("/subject")
	public ResponseEntity<Page<File>> findFilesSubject(@RequestParam Long idSubject, 
			@RequestParam(defaultValue = "0") Integer page, 
			@RequestParam(defaultValue = "3") Integer quantityPerPage){
		return null; //implementar
	}
	
	@GetMapping("/teacher")
	public ResponseEntity<Page<File>> findFilesTeacher(@RequestParam Long idTeacher, 
			@RequestParam(defaultValue = "0") Integer page, 
			@RequestParam(defaultValue = "3") Integer quantityPerPage){
		return null; //implementar
	}
	
}
