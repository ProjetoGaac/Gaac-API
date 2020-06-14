/** Class that represents User
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;


@MappedSuperclass
public abstract class User implements Serializable{
  
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "${msg.null}")
	@Length(min=3,max=40,message="O campo deve ter {min} caracteres e no máximo {max} caracteres")
	@Column(columnDefinition = "varchar(40)")
	//falta validar o nome
    private String name;
	
	@NotNull(message = "${msg.null}")
	@Length(max=50, message="O campo deve ter no máximo {max} caracteres")
	@Column(columnDefinition = "varchar(50) unique")
	//falta validar email
    private String email;
	
	@NotNull(message = "${msg.null}")
	@Length(max=7, message="O campo deve ter no máximo {max} caracteres")
	@Column(columnDefinition = "varchar(255) unique")
	//falta validar senha
    private String password;

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