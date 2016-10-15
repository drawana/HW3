package com.example.daniel.myapp;

/**
 * Created by Daniel on 2016-10-15.
 */

public class Person {
    protected String firstName;
    protected String lastName;
    protected String healthCardNo;
    protected String allergies;
    protected String symptoms;

    public Person()
    {

    }

    protected String createEmail()
    {
        String email = "";
        email += "New request from: " + firstName + " " + lastName + "\n";
        email += "Patient health card number: " + healthCardNo + "\n";
        email += "Patient allergies: " + allergies + "\n";
        email += "Patient symptoms: " + symptoms + "\n";
        return email;
    }

}
