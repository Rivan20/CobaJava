/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;

/**
 *
 * @author rivan
 */
public class Volunteer extends StaffMember {
    //Sets up a volunteer using the specified information
    public Volunteer(String eName, String eAddress, String ePhone) {
        super(eName, eAddress, ePhone);
    }
    
    //Returs a zero pau value for this volunteer
    public double pay() {
        return 0.0;
    }
}
