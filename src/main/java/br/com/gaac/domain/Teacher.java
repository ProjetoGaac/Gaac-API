/** Class that represents Teacher
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "teacher")
public class Teacher extends Employee implements Serializable{

	private static final long serialVersionUID = 1L;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "teacher_subject", 
		joinColumns = @JoinColumn(name = "teacher_id"),
		inverseJoinColumns = @JoinColumn(name = "subject_id"))
	private List<Subject> subjects = new ArrayList<>();
	
	@OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY)
	private List<File> files = new ArrayList<>();

	@ManyToMany(mappedBy = "teachers", fetch = FetchType.LAZY)
	private List<Course> courses = new ArrayList<>();

	public Teacher() {
		
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public void addSubject(Subject subject) {
		this.subjects.add(subject);
	}
	
	public void rmvSubject(Subject subject) {
		this.subjects.remove(subject);
	}	
	
}