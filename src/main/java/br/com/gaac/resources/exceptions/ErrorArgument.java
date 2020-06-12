/** Class that Object Error Argument Exception
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.resources.exceptions;


public class ErrorArgument extends ErrorModel{


    public  void ErrorArgument(Integer code, String status, String message){
        super(message,status,code);
    }

}