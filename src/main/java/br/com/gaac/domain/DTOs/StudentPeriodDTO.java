/** Class that represents StudentPeriodDTO
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.domain.DTOs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StudentPeriodDTO {
    
    private Long id;
    
    @NotNull(message = "${msg.null}")
    private Integer number;
    
    @NotNull(message = "${msg.null}")
    private String semesterYear;
    
    @NotNull(message = "${msg.null}")
	@JsonFormat(pattern = "dd/MM/YYYY")
    private Date startDate;
    
    @NotNull(message = "${msg.null}")
	@JsonFormat(pattern = "dd/MM/YYYY")
    private Date endDate;

    @NotNull(message = "${msg.null}")
    private List<Dependencie> subjects = new ArrayList<>();

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

    public List<Dependencie> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Dependencie> subjects) {
        this.subjects = subjects;
    }

}