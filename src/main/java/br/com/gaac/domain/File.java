//Falta os comentarios aqui
package br.com.gaac.domain;

import jdk.internal.loader.AbstractClassLoaderValue;

import java.util.Date;

public class File {
    //atribbutes of file
    private Long id;
    private String name;
    private Date date;
    private Boolean student;
    private Subject subject;
    private Teacher teacher;
    //falta o atributo student do tipo boolean
    
    //Criar o atributo do tipo Subject
    //Criar o atributo do tipo Teacher

    //methods of the Class File

    File(){ //public File()

    };

    //gett and sett Id

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    //gett and sett Name

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //gett and sett date


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    //method verifying if is the Student

    public Boolean isStudent(){
        return student;
    }

    //Sett Student Teacher and Subject

    public void setStudent(Boolean student){
        this.student = student;
    }
    
    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    public void setSuject(Subject subject){
        this.subject = subject;
    }

}
