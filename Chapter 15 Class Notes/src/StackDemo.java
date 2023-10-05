import java.util.Stack;

/**
 * This program simulates an undo stack. Note that operations
 * must be undone in the opposite order in which they are first
 * issued.
*/
public class StackDemo
{
    public static void main(String[] args)
    {
        Stack<String> commands = new Stack<>();
        commands.push("1");
        commands.push("2");
        commands.push("3");
        commands.push("4");
        commands.push("5");
        commands.push("6");
        commands.push("7");
        commands.push("8");
        System.out.println(commands);
        for (int i = 0; i < 4; i++)
            commands.pop();
        System.out.println(commands);
    }
}
