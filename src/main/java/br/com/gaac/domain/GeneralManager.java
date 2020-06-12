/** Class that represents General Manager
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.domain;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class GeneralManager extends Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public GeneralManager() {
		
	}
	
}
