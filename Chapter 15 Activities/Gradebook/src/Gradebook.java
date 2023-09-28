import java.util.*;
/**
 * A program to add, remove, modify or print
 * student names and grades.
*/
public class Gradebook
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        boolean done = false;
        while(!done)
        {
            System.out.println("A)dd R)emove M)odify P)rint Q)uit");
            String input = in.next().toUpperCase();
            if (input.equals("A"))
            {
                System.out.print("Student Name: ");
                input = in.next().toUpperCase();
                System.out.print("Course grade: ");
                map.put(input, in.next().toUpperCase());
            } 
            else if (input.equals("R"))
            {
                System.out.print("Student Name: ");   
                input = in.next().toUpperCase();
                map.remove(input);            
            } 
            else if (input.equals("M"))
            {
                System.out.print("Student Name: ");   
                input = in.next().toUpperCase();
                System.out.print("Course grade: ");
                map.put(input, in.next().toUpperCase());
                
            } 
            else if (input.equalsIgnoreCase("P"))
            {
                for (Map.Entry<String, String> me :map.entrySet()) {
                    System.out.print(me.getKey() + ":");
                    System.out.println(me.getValue());
                }
                
            } 
            else
                done = true;
        }
    }
}
