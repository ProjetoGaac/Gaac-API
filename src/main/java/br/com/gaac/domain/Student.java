/** Class that represents Student
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "student")
public class Student extends User implements Serializable{
	
    private static final long serialVersionUID = 1L;
	
    @Length(min=10, max=10, message = "O Campo deve ter {max} caracteres")
    @Column(columnDefinition = "char(10) unique")
    //validar matricula
	private String matriculation;
    
    private Boolean authorized;
   
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;
    
    @JsonIgnore
    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
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