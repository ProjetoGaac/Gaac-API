/** Class that represents DTO Course
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.domain.DTOs;

public class CourseDTO {
	
	private String code;
	private String name;
	private Float totalWorkload;
	
	/** Default Constructor */
	public CourseDTO() {
		
	}
	
	/** Method to return the code
	 * @return String - code */
	public String getCode() {
		return code;
	}
	
	/** Method to set the code 
	 * @param String - code */
	public void setCode(String code) {
		this.code = code;
	}

	/** Method to return the name
	 * @return String - name */
	public String getName() {
		return name;
	}

	/** Method to set the name 
	 * @param String - name */
	public void setName(String name) {
		this.name = name;
	}

	/** Method to return the totalWorkload
	 * @return Float - totalWorkload */
	public Float getTotalWorkload() {
		return totalWorkload;
	}

	/** Method to set the totalWorkload 
	 * @param Float - workload */
	public void setTotalWorkload(Float totalWorkload) {
		this.totalWorkload = totalWorkload;
	}

}
