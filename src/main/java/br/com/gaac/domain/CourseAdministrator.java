/** Class that represents CourseAdministrator
 * @author Gabriel Oliveira o terror delas
 * @version 1.0.0 */
package br.com.gaac.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class CourseAdministrator extends Employee implements Serializable{
    
	private static final long serialVersionUID = 1L;
	
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
