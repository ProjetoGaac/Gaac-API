/** Class that represents Course
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.domain;

import java.util.ArrayList;
import java.util.List;

public class Course {

	private Long id;
	private String code;
	private String name;
	private Float totalWorkload; 

	private CourseType courseType;

	private List<Period> periods = new ArrayList<>(); 
	private List<Teacher> teachers = new ArrayList<>(); 
	private List<CourseAdministrator> courseAdministrators = new ArrayList<>(); 

	public Course(){

	}

	// getters e setters

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

	// getters e setters acrescentados
	
	public CourseType getCourseType() {
        return courseType;
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


    public List<CourseAdministrator> getCourseAdministrators() {
        return courseAdministrators;
    }

   
    public void setCourseAdministrators(List<CourseAdministrator> courseAdministrators) {
        this.courseAdministrators = courseAdministrators;
    }

	//demais métodos

	public void setCourseType(CourseType courseType){
		this.courseType = courseType;
	}

	public void setPeriod(ArrayList<Period>periods){
		this.periods = periods;
	}


	public void setTeachers(ArrayList<Teacher> teachers){
		this.teachers = teachers;
	}

	public void setCourseAdministrator(ArrayList<CourseAdministrator> courseAdministrators){
		this.courseAdministrators = courseAdministrators;
	}


	// add and remove 

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


  
  

}