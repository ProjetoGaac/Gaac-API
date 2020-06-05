package br.com.gaac.domain;

public class Student extends User
{
    private String matriculation;
    private Boolean authorized;


    public Student()
    {

    }


    /**
     * @return String return the matriculation
     */
    public String getMatriculation() {
        return matriculation;
    }

    /**
     * @param matriculation the matriculation to set
     */
    public void setMatriculation(String matriculation) {
        this.matriculation = matriculation;
    }

    /**
     * @return Boolean return the authorized
     */
    public Boolean isAuthorized() {
        return authorized;
    }

    /**
     * @param authorized the authorized to set
     */
    public void setAuthorized(Boolean authorized) {
        this.authorized = authorized;
    }

}