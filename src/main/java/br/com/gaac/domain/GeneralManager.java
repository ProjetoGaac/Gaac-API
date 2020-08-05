/** Class that represents General Manager
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "general_manager")
public class GeneralManager extends Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	@ElementCollection
	@CollectionTable(name = "general_manager_category")
    private Set<Integer> generalManagerCategory = new HashSet<>();

	public GeneralManager() {
		
	}

	public Set<Integer> getGeneralManagerCategory() {
		return generalManagerCategory;
	}

	public void setGeneralManagerCategory(Set<Integer> generalManagerCategory) {
		this.generalManagerCategory = generalManagerCategory;
	}
	
	public void addGeneralManagerCategory(Integer category) {
		this.generalManagerCategory.add(category);
	}
	
	public void rmvGeneralManagerCategory(Integer category) {
		this.generalManagerCategory.remove(category);
	}
	
}
