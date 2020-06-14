/** Class that handles exceptions
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.resources.exceptions;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ResourceExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(ObjectBadRequestException.class)
	public ResponseEntity<ErrorModel> badRequestException(ObjectBadRequestException ex, HttpServletRequest request){
		
		ErrorModel em = new ErrorModel(HttpStatus.BAD_REQUEST.value(),"Bad Request",ex.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(em);
	}
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<ErrorModel> notFoundException(ObjectNotFoundException ex, HttpServletRequest request){
		
		ErrorModel em = new ErrorModel(HttpStatus.NOT_FOUND.value(), "Not Found", ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		List<ObjectErrorArgument> errors = ex.getBindingResult().getFieldErrors().stream()
				.map(error -> new ObjectErrorArgument(error.getDefaultMessage(),error.getField()))
				.collect(Collectors.toList());
		
		ErrorArgument ea = new ErrorArgument(status.value(),status.getReasonPhrase(),"Erro da Validação");
		ea.setErrors(errors);
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ea);
	}

}
