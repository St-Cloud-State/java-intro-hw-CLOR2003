import java.io.*;
import java.util.*;
import Hw1Q3.PersonList;

public class MyMain2 {    
    public static void main(String[] args){
        try{
            // Variable declarations
            String file = "/workspaces/java-intro-hw-CLOR2003/Hw1Q2/datafile";
            PersonList people = new PersonList();
            Scanner scan = new Scanner(new File(file));
            PrintWriter print = new PrintWriter(System.out);
            
            // store and display
            while(scan.hasNextLine()){
                people.store(scan);
            }
            System.out.println();
            System.out.println("People:");
            people.display(print);
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("error: " + e.getMessage());
        }
    }
}