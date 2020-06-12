package br.com.gaac.resources.exceptions;

public class ErrorModel {
    //Atributos
    Integer code;
    String status;
    String message;

    public void ErrorModel(Integer code, String status,String message){
        this.code = code;
        this.status = status;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
