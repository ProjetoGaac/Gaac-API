/** Class that represents Course
 * @author Jorge Gabriel
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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "course")
public class Course implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "${msg.null}")
	@Length(min=3,max=3, message = "O campo deve ter {max} caracteres")
	@Column(columnDefinition = "char(3) unique")
	private String code;
	
	@NotNull(message = "${msg.null}")
	@Length(min=3, max=40, message = "O campo deve possuir no min {min} caracteres e no máximo {max} caracteres")
	@Column(columnDefinition = "varchar(40)")
	private String name;
	
	@NotNull(message = "${msg.null}")
	@Column(columnDefinition = "float unsigned")
	private Float totalWorkload; 

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_type_id")
	private CourseType courseType;

	@JsonIgnore
	@OneToMany(mappedBy = "course",fetch = FetchType.LAZY)
	private List<Period> periods = new ArrayList<>(); 
	
	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "course_teacher", 
			joinColumns = @JoinColumn(name = "course_id"),
			inverseJoinColumns = @JoinColumn(name = "teacher_id"))
	private List<Teacher> teachers = new ArrayList<>();
	
	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "course_course_administrador", 
			joinColumns = @JoinColumn(name = "course_id"),
			inverseJoinColumns = @JoinColumn(name = "course_administrator_id"))
	private List<CourseAdministrator> courseAdministrators = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "course",fetch = FetchType.LAZY)
	private List<Student> students = new ArrayList<>();

	public Course(){

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getTotalWorkload() {
		return totalWorkload;
	}

	public void setTotalWorkload(Float totalWorkload) {
		this.totalWorkload = totalWorkload;
	}
	
	public CourseType getCourseType() {
        return courseType;
    }
	
	public void setCourseType(CourseType courseType){
		this.courseType = courseType;
	}

    public List<Period> getPeriods() {
        return periods;
    }

    public void setPeriods(List<Period> periods) {
        this.periods = periods;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
    
    public void setTeachers(List<Teacher> teachers){
		this.teachers = teachers;
	}
    
    public List<CourseAdministrator> getCourseAdministrators() {
        return courseAdministrators;
    }

    public void setCourseAdministrators(List<CourseAdministrator> courseAdministrators) {
        this.courseAdministrators = courseAdministrators;
    }
    
    public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void addPeriod(Period period){
		this.periods.add(period);
	}

	public void addTeacher(Teacher teacher){
		this.teachers.add(teacher);
	}

	public void addCourseAdministrator(CourseAdministrator courseAdministrator){
		this.courseAdministrators.add(courseAdministrator);
	}

	public void rmvTeacher(Teacher teacher){
		this.teachers.remove(teacher);
	}

	public void rmvCourseAdministrator(CourseAdministrator courseAdministrator){
		this.courseAdministrators.remove(courseAdministrator);
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
		Course other = (Course) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}