package br.com.gaac.domain;

import Domain.CourseType.java;

public class Course 
{
  private Long id;
  private String code;
  private String name;
  private Float totalWorkload;  
  private CourseType courseType;
  private Period period;
  private Teacher teacher;
  private CourseAdministrator courseAdministrator;  

    public Course()
    {

    }

    // getters e setters

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Float return the totalWorkload
     */
    public Float getTotalWorkload() {
        return totalWorkload;
    }

    /**
     * @param totalWorkload the totalWorkload to set
     */
    public void setTotalWorkload(Float totalWorkload) {
        this.totalWorkload = totalWorkload;
    }

    //demais métodos


    public void setCourseType(CourseType courseType)
    {
        this.setCourseType(courseType);

    }

    public void setPeriod(ArrayList<Period>periods)
    {
        this.setPeriod(periods);

    }
    

    public void setTeachers(ArrayList<Teacher> teachers)
    {
        this.setTeachers(teachers);
    }

    public void setCourseAdministrator(ArrayList<CourseAdministrator> courseAdm)
    {
        this.setCourseAdministrator(courseAdm);
    }


    // add and remove 


    public void addPeriod(Period period)
    {
        this.addPeriod(period);
    }

    public void addTeacher(Teacher teacher)
    {
        this.addTeacher(teacher);
    }

    public void addCourseAdministrator(CourseAdministrator courseAdministrator)
    {
        this.addCourseAdministrator(courseAdministrator);

    }


    

    public void rmvTeacher(Teacher teacher)
    {
        this.rmvTeacher(teacher);

    }

    public void rmvCourseAdministrator(CourseAdministrator courseAdministrator)
    {
        this.rmvCourseAdministrator(courseAdministrator);
    }

}