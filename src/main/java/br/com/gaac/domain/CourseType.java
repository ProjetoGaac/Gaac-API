/** Class that represents Subject
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.domain;

public class CourseType{

    private String name;
    private String description;
	
    public CourseType(String name, String description){
        this.name = name;
        this.description = description;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}