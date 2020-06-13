/** Class that represents User
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class User implements Serializable{
  
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    private String name;
    private String email;
    private String password;
    
    @ElementCollection
    @CollectionTable(name = "user_category")
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}