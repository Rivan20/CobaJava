/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;

/**
 *
 * @author rivan
 */
public class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;
    protected final int STANDARD_VACATION = 14;
    
    //Set up an employee with the specified information
    public Employee(String eName, String eAddress, String ePhone, 
                    String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, rate);
        
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }
    
    //Returns information about an employee as a string 
    @Override
    public String toString() {
        String result = super.toString();
        result += "\nSocial Security Number: " + socialSecurityNumber;
        return result;
    }
    
    //Returs the pau rate for this employee
    @Override
    public double pay() {
        return payRate;
    }
}
