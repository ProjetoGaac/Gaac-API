

package br.com.gaac.domain.DTOs;
 
public class SubjectDTO {
	
	private Long id;
	private String code;
	private String name;
    private Float workload;
    private float menu;
    private int amountTime;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SubjectDTO() {
		
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

    public float getmenu() {
		return this.menu;
	}

	public void setmenu(float menu) {
		this.menu = menu;
    }
    
    public int getAmountTime() {
		return this.amountTime;
	}

	public void setAmountTime(int amountTime) {
		this.amountTime = amountTime;
	}

    
}