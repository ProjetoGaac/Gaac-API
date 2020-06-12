/** Class that Object Bad Request Exception
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.resources.exceptions;


public class ObjectBadRequestException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ObjectBadRequestException(String message){
		super(message);
    }
    
}