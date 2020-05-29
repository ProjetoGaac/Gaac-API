/** Class that represents Period
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.domain;

import java.util.ArrayList;
import java.util.List;

public class Period {
	
	private Long id;
	private Integer number;
	
	private Course course;
	
	private List<Subject> subjects = new ArrayList<>();
	
	/** Default Period */
	public Period() {
		
	}
	
	/** Method to return id
	 * @return Long - id */
	public Long getId() {
		return id;
	}
	
	/** Method to set id
	 * @param Long - id*/
	public void setId(Long id) {
		this.id = id;
	}

	/** Method to return number
	 * @return Integer - number*/
	public Integer getNumber() {
		return number;
	}

	/** Method to set number
	 * @param Integer - number*/
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	/** Method to set subjects
	 * @param List<Subject> - subjects */
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	
	/** Method to add subject
	 * @param Subject - subject */
	public void addSubject(Subject subject) {
		this.subjects.add(subject);
	}
	
	/** Method to remove subject 
	 * @param Subject - subject */
	public void rmvSubject(Subject subject) {
		this.subjects.remove(subject);
	}
	
}
