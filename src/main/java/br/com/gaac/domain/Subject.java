/** Class that represents Subject
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.domain;

import java.util.ArrayList;
import java.util.List;


public class Subject {
	
	private Long id;
	private String code;
	private String name;
	private String menu;
	private Float workload;
	private Integer amountTime;
	
	private List<Subject> dependencies = new ArrayList<>();
	
	/*Falta
	 * files
	 * teachers
	 * studentPeriod
	 * periods
	 * */
	
	/** Default Constructor */
	public Subject() {
		
	}
	
	/** Method to return the id
	 * @return Long - id */
	public Long getId() {
		return id;
	}

	/** Method to set the id
	 * @param Long - id */
	public void setId(Long id) {
		this.id = id;
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

	/** Method to return the menu 
	 * @return String - menu */
	public String getMenu() {
		return menu;
	}
	
	/** Method to set the menu 
	 * @param String - menu */
	public void setMenu(String menu) {
		this.menu = menu;
	}

	/** Method to return the workload
	 * @return Float - workload */
	public Float getWorkload() {
		return workload;
	}

	/** Method to set the workload 
	 * @param Float - workload */
	public void setWorkload(Float workload) {
		this.workload = workload;
	}
	
	/** Method to return the amountTime 
	 * @return Integer - AmountTime*/
	public Integer getAmountTime() {
		return amountTime;
	}

	/** Method to set the amountTime 
	 * @param Integer - amountTime */
	public void setAmountTime(Integer amountTime) {
		this.amountTime = amountTime;
	}
	
	/** Method to add dependencie
	 * @param Subject - subject*/
	public void addDependencie(Subject subject) {
		this.dependencies.add(subject);
	}
	
}
