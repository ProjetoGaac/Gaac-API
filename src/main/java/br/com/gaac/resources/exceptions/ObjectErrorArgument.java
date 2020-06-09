/** Class that Object Error Argument
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.resources.exceptions;

public class ObjectErrorArgument {

    private String message;
    private String field;

    public ObjectErrorArgument(String message , String field){
        this.message = message;
        this.field = field;
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