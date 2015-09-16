//package com.company;

/**
 * Created by Tamanna on 9/16/2015.
 */
public class Customer {

    private String name;
    private String email;
    private char gender;

    //public Customer(){}
    public Customer(String name,String email,char gender)
    {
        this.name=name;
        this.email=email;
        this.gender=gender;

    }

    public Customer(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }


    public String getEmail()
    {
        return email;
    }


    public char getGender()
    {
        return gender;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }


    public void setGender(char gender)
    {
        this.gender=gender;
    }


    public void print()
    {
        System.out.println(name + "( " + gender + ") at "+ email);
    }





}

