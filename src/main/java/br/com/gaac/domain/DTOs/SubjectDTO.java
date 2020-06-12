/** Class that represents SubjectDTO
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.domain.DTOs;

import java.util.ArrayList;
import java.util.List;

public class SubjectDTO {
	
	private Long id;
	private String code;
	private String name;
    private Float workload;
    private Float menu;
    private Integer amountTime;
    
    private List<Dependencie> dependencies = new ArrayList<>();
    
    public SubjectDTO() {
    	
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getWorkload() {
		return this.workload;
	}

	public void setWorkload(Float workload) {
		this.workload = workload;
	}

    public Float getMenu() {
		return this.menu;
	}

	public void setMenu(Float menu) {
		this.menu = menu;
    }
    
    public Integer getAmountTime() {
		return this.amountTime;
	}

	public void setAmountTime(Integer amountTime) {
		this.amountTime = amountTime;
	}

    
}