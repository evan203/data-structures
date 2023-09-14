import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        // create LinkedList then populate the list using addLast
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Tony");
        staff.addLast("Natasha");
        staff.addLast("Peter");
        staff.addLast("Gamora");
        // staff = TNPG
        // create a new ListIterator to traverse through the LinkedList
        ListIterator<String> iterator = staff.listIterator();
        // the iterator is between two elements. it starts at in front of the first node.
        // the next method advances the iterator over the next element. 
        // the next method returns the element that the iterator is passing.
        System.out.println(iterator.next()); // prints "Tony"
        // the add method inserts an element at the iterator position
        // the iterator is then positioned after the element that was added
        iterator.add("Bruce"); // T|NPG ==> TB|NPG
        iterator.add("Rocket"); // TB|NPG ==> TBR|NPG
        // the remove method removes the element returned by the last next/previous
        // remove method can not be called after calling add/remove
        System.out.println("Removing " + iterator.next()); // TBRN|PG
        iterator.remove(); // Natasha gets removed
        System.out.println(staff);
        // the set method updates the element returned by the last call to next/previous
        iterator.previous(); // TBR|PG ==> TB|RPG
        iterator.set("Thor"); // TB|TPG
        System.out.println(staff);
        // the hasNext method is used to determine if there is a next node after the iterator
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
