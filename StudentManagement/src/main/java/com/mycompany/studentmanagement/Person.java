/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagement;

/**
 *
 * @author educa
 */
public class Person extends DriverAbstact {
    
    @Override
    public Licence getLicence(Licence licence){
        return licence;
    }  
 
    public String name;
    private int age;
    public String gender;
    public  int phone;
    public boolean isBlack;
    public static String country= "Rwanda";
    
    public Person(String gender, boolean race){
        this.gender = gender;
        this.isBlack = race;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
       return this.age;
    }
}
