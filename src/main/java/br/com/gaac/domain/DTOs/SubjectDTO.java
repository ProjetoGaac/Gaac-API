/** Class that represents SubjectDTO
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.domain.DTOs;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class SubjectDTO {
	
	private Long id;
	
	@NotNull(message = "${msg.null}")
	@Length(min=7, max=7, message = "O campo deve ter {max} caracteres")
	private String code;
	
	@NotNull(message = "${msg.null}")
	@Length(min=3, message = "O campo deve ter no mínimo {min} caracteres")
	private String name;
	
	@NotNull(message = "${msg.null}")
    private Float workload;
	
	@NotNull(message = "${msg.null}")
    private Float menu;
	
	@NotNull(message = "${msg.null}")
    private Integer amountTime;
    
	@NotNull(message = "${msg.null}")
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

	public List<Dependencie> getDependencies() {
		return dependencies;
	}

	public void setDependencies(List<Dependencie> dependencies) {
		this.dependencies = dependencies;
	}

}