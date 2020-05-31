/** Class that handles exceptions
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.resources.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ResourceExceptionHandler extends ResponseEntityExceptionHandler{
	
	public ResponseEntity<ErrorModel> badRequestException(ObjectBadRequestException ex, HttpServletRequest request){
		return null; //implementar
	}
	
	public ResponseEntity<ErrorModel> notFoundException(ObjectNotFoundException ex, HttpServletRequest request){
		return null; //implementar
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		return null; //implementar
	}

}
