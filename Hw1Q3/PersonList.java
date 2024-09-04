package Hw1Q3;

import Hw1Q1.Person;
import java.io.*;
import java.util.*;

public class PersonList {
    private LinkedList<Person> list = new LinkedList<Person>();

    public void display(PrintWriter output)throws Exception{
        if(this.list.isEmpty()){
            throw new Exception("nothing in list. Try inserting new person data");
        }
        this.list.forEach(person -> output.printf("Person :{id : %d, firstname : %s, lastname : %s}%n",person.getId(),person.getFirstName(),person.getLastName()));
        output.flush();
    }
    public void store(Scanner input){
        try{
            
            int id = input.nextInt();
            String firstName = input.next();
            String lastName = input.next();
            
            Person person = new Person(firstName,lastName,id);
            this.list.add(person);
            System.out.printf("Person successfully added: %s %s%n", firstName,lastName);
        }
        catch(Exception e){
            System.out.println("error: "+e.getMessage());
        }
    }
    public int find(String sid){
        for(int i=0;i<this.list.size();i++){
            int index = this.list.get(i).getId();
            String str = Integer.toString(index);
            if(sid.equals(str)){
                return index;
            }
        }
        System.out.println("error: Could not find id");
        return -1;
    }
}