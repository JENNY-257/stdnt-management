
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
public abstract class DriverAbstact {
 public abstract Licence getLicence(Licence lice);
 public boolean hasControltechnique(Date date){
     var today = new Date();
     return today.getTime() > date.getTime();
 
 }
    
}
