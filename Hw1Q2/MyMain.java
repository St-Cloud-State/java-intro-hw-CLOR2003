import java.io.*;
import java.util.*;
import Hw1Q1.Person;

public class MyMain {    
    public static void display(PrintWriter output, LinkedList<Person> list){
        list.forEach(person -> output.printf("Person :{id : %d, firstname : %s, lastname : %s}%n",person.getId(),person.getFirstName(),person.getLastName()));
        output.flush();
    }

    public static void store(Scanner input, LinkedList<Person> list){
            try{
                int id = input.nextInt();
                String firstName = input.next();
                String lastName = input.next();

                Person person = new Person(firstName,lastName,id);
                list.add(person);
                System.out.printf("Person successfully added: %s %s%n", firstName,lastName);
            }
            catch(Exception e){
                System.out.println("error: "+e.getMessage());
            }
        }

        public static int find(String sid, LinkedList<Person> list){
            for(int i=0;i<list.size();i++){
                int index = list.get(i).getId();
                String str = Integer.toString(index);
                if(sid.equals(str)){
                    return index;
                }
            }
            System.out.println("error: Could not find id");
            return -1;
        }

    public static void main(String[] args){
        try{
            // Variable declarations
            String file = "/workspaces/java-intro-hw-CLOR2003/Hw1Q2/datafile";
            LinkedList<Person> people = new LinkedList<>();
            Scanner scan = new Scanner(new File(file));
            PrintWriter print = new PrintWriter(System.out);
            
            // store and display
            while(scan.hasNextLine()){
                store(scan,people);
            }
            System.out.println();
            System.out.println("People:");
            display(print,people);
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}