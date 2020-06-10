//Falta comentários aqui
package br.com.gaac.domain;

import com.sun.tools.javac.util.List;

import java.util.ArrayList;
import java.util.List;



public class CourseAdministrator extends Employee { //Extends de Employee
    
	//criar lista de Course, olha o diagrama da domain
	private List<Course> courses = new ArrayList<>();

	public CourseAdministrator() {

    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
