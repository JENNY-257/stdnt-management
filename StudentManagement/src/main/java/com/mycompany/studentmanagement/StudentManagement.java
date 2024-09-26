/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentmanagement;

/**
 *
 * @author educa
 */

import java.util.Date;
public class StudentManagement {

    public static void main(String[] args) {
        

            Person person;
            person = new Person("Female", true);
            person.setAge(10);
            person.name = "jue";
            person.phone =10102012;
            
            Department dep = new Department();
            Student stud = new Student(dep,"Male",true);
            dep.school = "ICT";
            dep.departmentName = "CS";
            
            System.out.println(stud.department.school);
            System.out.println(stud.gender);
            System.out.println(stud.isBlack);
            
            Licence li = new Licence();
            li.licenceId = "12088773";
            li.expDate = new Date();
            System.out.println(person.getLicence(li));
            System.out.println(person.hasControltechnique(li.expDate));
            School schol = new School("muhabura");
              
            System.out.println(schol.schoolName);
            System.out.println(schol.schoolClassName);
            
            School.anounce("Today there is a meeting at main hall pllease evryone is supposed to come with student card");
            
            
       
            
//            System.out.println(person.getAge());
//            
//            System.out.println(person.gender);
//            
//            System.out.println(person.isBlack);
//            
//            System.out.println(person.phone);
//            
//            System.out.println(person.country);
//            
//            System.out.println(person.name);
    }
}
