/** Class that represents DTO Course
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.domain.DTOs;

public class CourseDTO {
	
	private String code;
	private String name;
	private Float totalWorkload;
	
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

}
