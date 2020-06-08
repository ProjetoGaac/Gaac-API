/** Class that represents StudentPeriodDTO
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.domain.DTOs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentPeriodDTO {
    
    private Long id;
    private Integer number;
    private String semesterYear;
    private Date startDate;
    private Date endDate;

    private List<Dependencie> dependencie = new ArrayList<>();

    public StudentPeriodDTO(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   
    public Integer getNumber() {
        return number;
    }
   
    public void setNumber(Integer number) {
        this.number = number;
    }
   
    public String getSemesterYear() {
        return semesterYear;
    }

    public void setSemesterYear(String semesterYear) {
        this.semesterYear = semesterYear;
    }
   
    public Date getStartDate() {
        return startDate;
    }
   
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
  
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

}