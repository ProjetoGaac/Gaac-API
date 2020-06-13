/** Class that represents Employee
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.hibernate.validator.constraints.Length;

@MappedSuperclass
public abstract class Employee extends User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Length(min = 3, message = "O campo deve ter no mínimo {min} caracteres")
	@Column(columnDefinition = "varchar(50)")
	private String office;
	
	@Length(min = 5, message = "O campo deve ter no mínimo {min} caracteres")
	@Column(columnDefinition = "varchar(40) unique")
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