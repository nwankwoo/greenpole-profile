
package org.greenpole.model.profiler;

/**
 * <h1>UserDetails</h1>
 * This class represents a basic information of a user
 * @author Yusuf Samsudeen Babashola 
 */
public class UserDetails {
    private String firstname;
    private String middlename;
    private String lastname;
    private String department;
    private String emailAdderess;

    

    public UserDetails(String firstname, String middlename, String lastname, String department, String emailAdderess) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.department = department;
        this.emailAdderess = emailAdderess;
    }
    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }
    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the middlename
     */
    public String getMiddlename() {
        return middlename;
    }

    /**
     * @param middlename the middlename to set
     */
    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the emailAdderess
     */
    public String getEmailAdderess() {
        return emailAdderess;
    }

    /**
     * @param emailAdderess the emailAdderess to set
     */
    public void setEmailAdderess(String emailAdderess) {
        this.emailAdderess = emailAdderess;
    }
    
}
