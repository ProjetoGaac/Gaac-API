//Falta os comentário aqui
package br.com.gaac.domain;

public class Student extends User
{
    private String matriculation;
    private Boolean authorized;
    
    
    //Criar lista de studentPeriod olha o diagrama da domain
    //Falta criar um atributo do tipo Course

    public Student()
    {

    }


    public String getMatriculation() {
        return matriculation;
    }

    public void setMatriculation(String matriculation) {
        this.matriculation = matriculation;
    }

    public Boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(Boolean authorized) {
        this.authorized = authorized;
    }

}