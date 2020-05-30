/** Class that represents the services of the File class 
 * Author of the struct 
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.service;

import org.springframework.web.multipart.MultipartFile;

import br.com.gaac.domain.Subject;

public class FileService {
	
	private static final String DIRECTORY_ROOT = ""; //Definir caminho
	
	//Definir nome da pasta onde vai ficar os arquivos no servidor
	private static final String DIRECTORY = ""; 
	
	/** Method to upload teacher files 
	 * @param Teacher - teacher 
	 * @param Subject - subject 
	 * @param MultipartFile - file 
	 * @return File*/
	public File upload(Teacher teacher, Subject subject, MultipartFile file) {
		return null; //implementar
	}
	
	/** Method to upload student files 
	 * @param Student - student 
	 * @param Subject - Subject 
	 * @param MultipartFile - file 
	 * @return File */
	public File uploadStudent(Student student, Subject subject, MultipartFile file) {
		return null; //implementar
	}
	
	/** Method to download files 
	 * @param String - name
	 * @return byte[] */
	public byte[] download(String name) {
		return null; //implementar
	}
	
	/** Method to rename a file 
	 * @param String - name 
	 * @param MultipartFile - file 
	 * @return File */
	public File rename(String name, MultipartFile file) {
		return null; //implementar
	}
	
	/** Method to delete a file
	 * @param String - name 
	 * @return void*/
	public void delete(String name) {
		//implementar
	}
	
	/** Method to delete subject files 
	 * @param Subject - subject 
	 * @return void */
	public void delete(Subject subject) {
		//implementar
	}
	
	/** Method to delete teacher files 
	 * @param Teacher - teacher 
	 * @return void */
	public void delete(Teacher teacher) {
		//implementar
	}
	
	/** Method to find subject files 
	 * @param Subject - subject 
	 * @param Integer - page
	 * @param Integer - quantityPerPage 
	 * @return Page<File> */
	public Page<File> findFilesSubject(Subject subject, Integer page, Integer quantityPerPage){
		return null; //implementar
	}
	
	/** Method to find teacher files 
	 * @param Teacher - teacher 
	 * @param Integer - page 
	 * @param Integer - quantityPerPage 
	 * @return Page<File> */
	public Page<File> findFilesTeacher(Teacher teacher,Subject subject, Integer page, Integer quantityPerPage){
		return null; //implementar
	}
	 
}
