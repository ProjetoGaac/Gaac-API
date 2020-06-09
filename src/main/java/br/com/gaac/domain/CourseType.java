/** Class that represents CourseType
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.domain;

public class CourseType{

	private Long id;
    private String name;
	private String description;
	
	//Adicionar uma lista de courses, olha o diagrama de classe do domain.

	public CourseType(){

	}

	public CourseType(String name){
        this.name = name;
	}
	
	public CourseType(String name, String description){
        this.name = name;
        this.description = description;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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