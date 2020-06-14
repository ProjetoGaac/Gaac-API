/** Class that represents CourseAdministrator
 * @author Gabriel Oliveira o terror delas
 * @version 1.0.0 */
package br.com.gaac.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "course_administrator")
public class CourseAdministrator extends Employee implements Serializable{
    
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "courseAdministrators", fetch = FetchType.LAZY)
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
