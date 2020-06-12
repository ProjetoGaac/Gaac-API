/** Class that Object Error Argument Exception
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ErrorArgument extends ErrorModel{
	
	private List<ObjectErrorArgument> errors = new ArrayList<>();

    public ErrorArgument(Integer code, String status, String message){
        super(code,status,message);
    }
    
    public void setErrors(List<ObjectErrorArgument> errors) {
    	this.errors = errors;
    }
    
    public List<ObjectErrorArgument> getErrors(){
    	return this.errors;
    }

}