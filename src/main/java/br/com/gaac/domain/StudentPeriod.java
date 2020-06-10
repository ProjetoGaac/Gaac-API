//Falta comentários aqui
package br.com.gaac.domain;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class StudentPeriod {
    //atribbutes about this class
    private Long id;
    private Integer number; // é Integer e não int
    private String semesterYear;
    private Date startDate;
    private Date endDate;
    private Student student;

    private List<Subject> subjects = new ArrayList<>();
    
    //Criar o atributo do tipo Student, olha o relacionamento no diagrama da domain

    //methods of this class

    StudentPeriod(){ //Tá errado

    }

    //gett and sett of the Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //gett and sett of the Number

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //get and set of Semester


    public String getSemesterYear() {
        return semesterYear;
    }

    public void setSemesterYear(String semesterYear) {
        this.semesterYear = semesterYear;
    }

    //get and set of StartDate

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    //get and set of EndDate

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void addSubject(Subject subject){
        this.subjects.add(subject);
    }
    public void rmvSubject(Subject subject){
        this.subjects.remove(subject);
    }

    public void setSubjects(ArrayList<Subject> subject){
        this.subjects = subject;
    }
}
