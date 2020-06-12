/** Class that Object Not Found Exception
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.resources.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ObjectNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String message){
          super(message);
    }
    
}