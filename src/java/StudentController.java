/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author tawashy
 */
@Named(value = "studentController")
@SessionScoped
public class StudentController implements Serializable {
    
    String firstName;
    String lastName;
    String emailAddress; 
    String dateOfBirth;
    String response;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastNAme) {
        this.lastName = lastNAme;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getResponse() {
        response = "";
        if (firstName != null && lastName != null && emailAddress != null && dateOfBirth != null){
            response = response.concat("<h3>Hello " + firstName + " " + lastName + "</h3>");
            response = response.concat("<h4> Your email Address is " + emailAddress + "</h4>");
            response = response.concat("<h4> Your Date of Birth is " + dateOfBirth + "</h4>");
        }
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    /**
     * Creates a new instance of StudentController
     */
    public StudentController() {
    }
    
}
