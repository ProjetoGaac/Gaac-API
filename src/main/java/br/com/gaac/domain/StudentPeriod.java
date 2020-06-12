/** Class that represents StudentPeriod
 * @author Gabriel Oliveira o terror delas
 * @version 1.0.0 */
package br.com.gaac.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class StudentPeriod implements Serializable{
    
	private static final long serialVersionUID = 1L;
	
	private Long id;
    private Integer number;
    private String semesterYear;
    private Date startDate;
    private Date endDate;
    
    private Student student;

    private List<Subject> subjects = new ArrayList<>();

    public StudentPeriod(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getSemesterYear() {
        return semesterYear;
    }

    public void setSemesterYear(String semesterYear) {
        this.semesterYear = semesterYear;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    public Student getStudent() {
    	return this.student;
    }
    
    public void setStudent(Student student) {
    	this.student = student;
    }
    
    public List<Subject> getSubjects(){
    	return subjects;
    }
    
    public void setSubjects(List<Subject> subjects){
        this.subjects = subjects;
    }

    public void addSubject(Subject subject){
        this.subjects.add(subject);
    }
    
    public void rmvSubject(Subject subject){
        this.subjects.remove(subject);
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentPeriod other = (StudentPeriod) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
