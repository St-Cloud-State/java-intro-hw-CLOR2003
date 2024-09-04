package Hw1Q1;

import java.util.*;

public class Person {
    // Class Variable
    private static List<Integer> idUnique = new ArrayList<Integer>();

    // Class Instance Variables
    private String firstname;
    private String lastname;
    private int id;

    // Constructor
    public Person(String firstname,String lastname, int id) throws Exception{
        
        if(!idUnique.isEmpty()){
            for(int i=0;i<idUnique.size();i++){
                if(id == idUnique.get(i)){
                    throw new Exception("id not unique");
                }
            }
        }

        idUnique.add(id);
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Accessors
    public int getId(){
        return this.id;
    }

    public String getFirstName(){
        return this.firstname;
    }
    
    public String getLastName(){
        return this.lastname;
    }

    // toString method
    public String toString(){
        return "Person:{firstname = " + this.firstname + ", lastname = " + this.lastname + ", id = " + this.id + "}";
    }
}