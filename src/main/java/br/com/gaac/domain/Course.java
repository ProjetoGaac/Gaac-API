//Falta os comentários aqui
package br.com.gaac.domain;

import Domain.CourseType.java;

//Identar a classe
public class Course 
{
  private Long id;
  private String code;
  private String name;
  private Float totalWorkload; 
  
  private CourseType courseType;
  
  private Period period; //é uma lista olha o diagrama
  private Teacher teacher; //é uma lista
  private CourseAdministrator courseAdministrator;  //é uma lista

    public Course()
    {

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

    //demais métodos
    
    //Todos esses estão com a implementação erradas, estão chamando eles mesmos.
    //Esses metodos tem que settar os atributos da classe
    //Vê a classe Subject nos List

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