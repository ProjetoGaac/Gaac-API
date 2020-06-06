/** Class that represents Teacher
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.domain;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Employee{

	private List<Subject> subjects = new ArrayList<>();
	
	//Criar lista de files.
	
	//Criar lista de courses
	
	public Teacher() {
		
	}

	public void addSubject(Subject subject) {
		this.subjects.add(subject);
	}
	
	public void rmvSubject(Subject subject) {
		this.subjects.remove(subject);
	}	
	
}