/** Class that represents DTO Course
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.domain.DTOs;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class CourseDTO {
	
	@NotNull(message = "${msg.null}")
	@Length(min=3,max=3, message = "O campo deve ter {max} caracteres")
	private String code;
	
	@NotNull(message = "${msg.null}")
	@Length(min=3, max=40, message = "O campo deve possuir no min {min} caracteres e no máximo {max} caracteres")
	private String name;
	
	@NotNull(message = "${msg.null}")
	private Float totalWorkload;
	
	@NotNull(message = "${msg.null}")
	private List<PeriodDTO> periods = new ArrayList<>();
	
	public CourseDTO() {
		
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

	public List<PeriodDTO> getPeriods() {
		return periods;
	}

	public void setPeriods(List<PeriodDTO> periods) {
		this.periods = periods;
	}

}
