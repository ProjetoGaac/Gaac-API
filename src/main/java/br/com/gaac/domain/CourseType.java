/** Class that represents CourseType
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "course_type")
public class CourseType implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "${msg.null}")
	@Length(min=3,max=40, message="O Campo deve ter no mínimo {min} caracteres e no máximo {max} caracteres")
    @Column(columnDefinition = "varchar(40) unique")
	private String name;
	
	@NotNull(message = "${msg.null}")
	@Length(min=15, max=100, message="O campo deve ter no mínimo {min} caracteres e no máximo {max} caracteres")
	@Column(columnDefinition = "varchar(100)")
	private String description;
	
	@JsonIgnore
	@OneToMany(mappedBy = "courseType", fetch = FetchType.LAZY)
	private List<Course> courses = new ArrayList<>();

	public CourseType(){

	}

	public CourseType(String name){
        this.name = name;
	}
	
	public CourseType(String name, String description){
        this.name = name;
        this.description = description;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
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
		CourseType other = (CourseType) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}