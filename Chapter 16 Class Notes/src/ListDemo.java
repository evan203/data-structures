/**
 *   A program that demonstrates the LinkedList class
 */
public class ListDemo
{
    public static void main(String[] args)
    {
        LinkedList students = new LinkedList();
        students.addFirst("Esha");
        students.addFirst("seth");
        students.addFirst("evan");
        students.addFirst("celeste");
        ListIterator i = students.listIterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
