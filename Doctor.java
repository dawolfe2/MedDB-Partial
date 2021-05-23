
package doctor;

    //Doctor class that is a subclass of employee
    //contains variables specific to doctor staff
    //doctor class has ___ admin status
public class Doctor extends Employee{
    
        //string describing the doctors expertise
    private String specialty; 
   
        //constructor that inherits variables from employee class
    public Doctor(String specialty, String first, String last, ... ){
        super(first, last, ...);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
            
}
