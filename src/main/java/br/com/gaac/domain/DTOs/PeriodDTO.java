/** Class that represents PeriodDTO
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.domain.DTOs;
 
public class PeriodDTO {
	
    private Integer ordinal; //o nome é number
    
    private List<Dependecie> dependecies = new ArrayList<>();
    
    private List<CourseDTO> courseDTOs = new ArrayList<>(); 

    public PeriodDTO(); //falta as chaves

	public Integer getOrdinal() {
		return this.ordinal;
	}

	public void setOrdinal(Integer ordinal) {
		this.ordinal = ordinal;
	}

    
}