/** Class that Object Error Argument
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.resources.exceptions;


public class ObjectErrorArgument {

    private String message;
    private String field;
    private ErrorArgument errorArgument;


    public void ObjectErrorArgument(String message , String field){
        
    }

    
    public String getMessage() {
        return message;
    }

   
    public void setMessage(String message) {
        this.message = message;
    }

    
    public String getField() {
        return field;
    }

    
    public void setField(String field) {
        this.field = field;
    }

}