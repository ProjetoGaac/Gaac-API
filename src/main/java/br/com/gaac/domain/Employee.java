//falta os comentarios aqui olha as outras classes;
package br.com.gaac.domain;

public class Employee extends User 
{
	private String office;
	private String user;
    
    
    
    public Employee()
    {

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