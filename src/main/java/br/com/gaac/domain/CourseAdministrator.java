/** Class that represents Subject
 * @author Gabriel Oliveira
 * @version 1.0.0 */
package br.com.gaac.domain;

import java.util.ArrayList;
import java.util.List;


public class CourseAdministrator extends Employee {
    
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
