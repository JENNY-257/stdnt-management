/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagement;

/**
 *
 * @author educa
 */
public class Student extends Person{
    
    public String studentId;
    // private int studentClass;
    public Department department;
    
    public Student( Department department,  String gender, boolean isBlack){
        
        super(gender,isBlack);
        this.department = department;
        
    }

    
}
