import java.util.Scanner;
import java.util.Stack;

/**
 * Class for reversing the order of a sentence.
*/
public class SentenceReverser
{
    /**
     * Reverses the given sentence.
     *
     * @param sentence Sentence to be reversed.
     * @return reversed sentence.
    */
    public static String reverse(String sentence)
    {
    	Scanner scanner = new Scanner(sentence);
        scanner.useDelimiter(" ");
    	
        // Complete this method. Use a Stack.
        Stack<String> stack = new Stack<>();
        String str = scanner.next().toLowerCase();
        String reversed = new String();
        // while loop for each sentence seperated by comma
        while (scanner.hasNext()) 
        {
            while (scanner.hasNext() && !str.contains("."))
            {
                stack.push(str);
                str = scanner.next().toLowerCase();
            }
            stack.push(str.substring(0, str.length() - 1));
            str = "";
            while (stack.size() > 0)
                str += stack.pop() + " ";
            reversed += new String(Character.toUpperCase(str.charAt(0)) + str.substring(1, (str.length() - 1)) + ". ");
            if (scanner.hasNext()) 
                str = scanner.next().toLowerCase();
        }
        return reversed;
    }
}
