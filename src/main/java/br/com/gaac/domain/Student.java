/** Class that represents Student
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "student")
public class Student extends User implements Serializable{
	
    private static final long serialVersionUID = 1L;
	
	private String matriculation;
    private Boolean authorized;
   
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
    
    @OneToMany(mappedBy = "student")
    private List<StudentPeriod> studentPeriods = new ArrayList<>();
    
    public Student(){

    }

    public String getMatriculation() {
        return matriculation;
    }

    public void setMatriculation(String matriculation) {
        this.matriculation = matriculation;
    }

    public Boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(Boolean authorized) {
        this.authorized = authorized;
    }
   
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<StudentPeriod> getStudentPeriod() {
        return studentPeriods;
    }

    public void setStudentPeriod(List<StudentPeriod> studentPeriods) {
        this.studentPeriods = studentPeriods;
    }

}