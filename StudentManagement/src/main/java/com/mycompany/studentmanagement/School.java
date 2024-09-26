/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagement;

/**
 *
 * @author educa
 */
public class School {
    public static String schoolName = "GreenWorld high";
    public String schoolClassName;
    
    public School(String schoolClassName){
        
    this.schoolClassName = schoolClassName;
    }
    public static void anounce (String message){
        System.out.println("Announcement :  " + message);
    
    }
}
