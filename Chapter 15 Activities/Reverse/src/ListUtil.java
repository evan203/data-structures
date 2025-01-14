import java.util.LinkedList;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        String f = strings.getFirst();
        for (int i = 0; ! strings.getLast().equals(f); i++ )
        {
            strings.add(i, strings.getLast());
            strings.removeLast();
        }
    }
}