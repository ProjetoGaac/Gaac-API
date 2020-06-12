/** Class that represents File
 * @author Gabriel Oliveira o terror delas
 * @version 1.0.0 */
package br.com.gaac.domain;

import java.util.Date;

public class File {
    //atribbutes of file
    private Long id;
    private String name;
    private Date date;
    private Boolean student;
    
    private Subject subject;
    private Teacher teacher;

    //methods of the Class File

    public File(){

    }

    //gett and sett Id

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    //gett and sett Name

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //gett and sett date

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    //method verifying if is the Student
    
    public Boolean isStudent(){
        return student;
    }
    
    public void setStudent(Boolean student){
        this.student = student;
    }

    public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Teacher getTeacher() {
		return teacher;
	}
    
    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }

}
