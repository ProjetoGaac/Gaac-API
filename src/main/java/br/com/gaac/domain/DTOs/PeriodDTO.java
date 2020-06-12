/** Class that represents PeriodDTO
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.domain.DTOs;

import java.util.ArrayList;
import java.util.List;

public class PeriodDTO {
	
    private Integer number;
    
    private CourseDTO course;
    
    private List<Dependencie> subjects = new ArrayList<>();

    public PeriodDTO() {
    	
    };

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

    
}