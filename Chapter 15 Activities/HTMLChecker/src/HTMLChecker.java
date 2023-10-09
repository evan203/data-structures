import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
/**
 * Write a program that checks whether a sequence of HTML tags
 * is properly nested. For each opening tag, such as <p>, there
 * must be a closing tag </p>. A tag such as <p> may have other
 * tags inside, for example <p> <ul> <li> </li> </ul> <a> </a> </p>
 * <p>
 * The inner tags must be closed before the outer ones.
 * Your program should process a file containing tags.
 * For simplicity, assume that the tags are separated by
 * spaces, and that there is no text inside the tags.
*/
public class HTMLChecker
{
    public static void main(String[] args)
    {
        String filename = "Chapter 15 Activities/HTMLChecker/src/TagSample2.html";

        try (Scanner in = new Scanner(new File(filename)))
        {
            // Your code goes here
            in.useDelimiter(" ");
            Stack<String> tags = new Stack<>();
            while (in.hasNext())
            {
                String tag = in.next();
                tag = tag.substring(1, tag.indexOf(">"));
                if (tag.charAt(0) == '/' )
                {
                    if (tags.peek().equals(tag.substring(1)))
                        tags.pop();
                    else
                        System.out.println("HTML tag improperly formatted: "+tag);
                }
                else
                    tags.push(tag);
            }


        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }

    }
}
