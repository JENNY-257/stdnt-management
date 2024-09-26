/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagement;

/**
 *
 * @author educa
 */
import java.util.Date;
public class  Licence {
    
    public String licenceId;
    public Date expDate;
    
        @Override
    public String toString() {
        return "Licence ID: " + licenceId + ", Expiry Date: " + expDate;
    }
}
