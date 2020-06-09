/** Class that represents Student
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.domain;

import java.util.ArrayList;
import java.util.List;

public class Student extends User{
	
    private String matriculation;
    private Boolean authorized;
   
    private Course course;
    
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


   //getters e setters acrescentados
   
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