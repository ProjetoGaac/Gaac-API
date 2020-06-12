/** Class that Object Bad Request Exception
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.resources.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ObjectBadRequestException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ObjectBadRequestException(String message){
		super(message);
    }
    
}