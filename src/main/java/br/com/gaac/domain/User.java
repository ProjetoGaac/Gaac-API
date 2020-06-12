/** Class that represents User
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.domain;

import java.util.HashSet;
import java.util.Set;

public abstract class User{
  
    private Long id;
    private String name;
    private String email;
    private String password;
    private Set<Integer> userCategory = new HashSet<>();

    public User(){
    	
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

	public String getEmail() {
		return this.email;
	}
   
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}
     
	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Integer> getUserCategory() {
		return this.userCategory;
	}
	
	public void setUserCategory(Set<Integer> userCategory) {
		this.userCategory = userCategory;
	}

	public void addUserCategory(Integer category) {
		this.userCategory.add(category);
	}

	public void rmvUserCategory(Integer category) {
		this.userCategory.remove(category);
	}

}