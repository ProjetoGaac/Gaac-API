

package br.com.gaac.domain.DTOs;
 
public class SubjectDTO {
	
	private String code;
	private String name;
    private Float totalWorkload;
    private float courseMenu;
    private int timeAmount;

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

	public Float getTotalWorkload() {
		return this.totalWorkload;
	}

	public void setTotalWorkload(Float totalWorkload) {
		this.totalWorkload = totalWorkload;
	}

    public float getCourseMenu() {
		return this.courseMenu;
	}

	public void setCourseMenu(float courseMenu) {
		this.courseMenu = courseMenu;
    }
    
    public int getTimeAmount() {
		return this.timeAmount;
	}

	public void setTimeAmount(int timeAmount) {
		this.timeAmount = timeAmount;
	}

    
}