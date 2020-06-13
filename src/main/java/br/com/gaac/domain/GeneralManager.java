/** Class that represents General Manager
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "general_manager")
public class GeneralManager extends Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public GeneralManager() {
		
	}
	
}
