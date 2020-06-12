/** Class that represents Employee
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.domain;

public abstract class Employee extends User {
	
	private String office;
	private String user;
    
    public Employee(){

    }
	
    public String getOffice() {
        return office;
    }
    
    public void setOffice(String office) {
        this.office = office;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

}