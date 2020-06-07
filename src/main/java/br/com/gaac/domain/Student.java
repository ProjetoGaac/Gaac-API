

/** Class that represents Course
 * @author Jorge Gabriel
 * @version 1.0.0 */

package br.com.gaac.domain;

public class Student extends User
{
    private String matriculation;
    private Boolean authorized;
    private List <StudentPeriod> studentPeriod = new ArrayList<>();
    private Course course;
    
 

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