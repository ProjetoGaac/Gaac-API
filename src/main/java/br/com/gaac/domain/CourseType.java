/** Class that represents Subject
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.domain;

public class CourseType{

    private String name;
    private String description;

	/** Default Constructor */
    public CourseType(String name, String description){
        this.name = name;
        this.description = description;
	}
	
	/** Method to return the name
	 * @return String - name */
	public String getName() {
		return this.name;
	}

	/** Method to set the name
	 * @param String - name */
	public void setName(String name) {
		this.name = name;
	}

	/** Method to get the description
	 * @return8 String - description */
	public String getDescription() {
		return this.description;
	}
	/** Method to set the description
	 * @param String - description */
	public void setDescription(String description) {
		this.description = description;
	}


}