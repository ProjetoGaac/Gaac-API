/** Class that represents Subject
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.domain;

public class User{
  
    private Long id;
    private String name;
    private String email;
    private String password;
    private boolean especialPermission;

    /** Default Constructor */
    public User(){}    

    /** Method to return the id
	 * @return Long - id */
	public Long getId() {
		return this.id;
	}

    /** Method to set the id
	 * @param Long - id */
	public void setId(Long id) {
		this.id = id;
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

    /** Method to return the email
	 * @return String - email */
	public String getEmail() {
		return this.email;
	}

	/** Method to set the email
	 * @param String - email */       
	public void setEmail(String email) {
		this.email = email;
	}

    /** Method to return the password
	 * @return String - password */
	public String getPassword() {
		return this.password;
	}

	/** Method to set the password
	 * @param String - password */       
	public void setPassword(String password) {
		this.password = password;
	}

    /** Method to return the especialPermission
	 * @return boolean - especialPermission */
	public boolean isEspecialPermission() {
		return this.especialPermission;
	}

	/** Method to set the especialPermission
	 * @param String - especialPermission */       
	public void setEspecialPermission(boolean especialPermission) {
		this.especialPermission = especialPermission;
	}





  
}