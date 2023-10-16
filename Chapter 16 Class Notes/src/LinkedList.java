import java.util.NoSuchElementException;

/**
 * A linked list is a sequence of nodes with efficient
 * element insertion and removal. This class
 * contains a subset of the methods of the standard
 * java.util.LinkedList class.
*/
public class LinkedList
{
    private Node first;
    /**
        Constructs an empty linked list.
    */
    public LinkedList()
    {
        this.first = null;
    }
    /**
        Returns the first element in the linked list.
        @return the first element in the linked list
    */
    public Object getFirst()
    {
        if (this.first==null) throw new NoSuchElementException(); 
        return this.first.data;
    }
    /**
        Removes the first element in the linked list.
        @return the removed element
    */
    public Object removeFirst()
    {
        if (this.first==null) throw new NoSuchElementException(); 
        Object oldFirst = this.first.data;
        this.first = this.first.next;
        return oldFirst;
        
    }
    /**
        Adds an element to the front of the linked list.
        @param element the element to add
    */
    public void addFirst(Object o)
    {
        Node add = new Node();
        add.data = o;
        add.next=this.first;
        this.first = add;
    }
    /**
        Returns an iterator for iterating through this list.
        @return an iterator for iterating through this list
    */
    //Class Node
    static class Node
    {
        public Object data;
        public Node next;
    }

    class LinkedListIterator implements ListIterator
    {
        // private data
        private Node current;
        private Node prev;
        private Boolean isAfterNext;

        public LinkedListIterator()
        {
            current = null;
            prev = null;
            isAfterNext = false;
        }

        /**
         * Moves the iterator past the next element.
         * 
         * @return the traversed element
         */
        Object next();

        /**
         * Tests if there is an element after the iterator position.
         * 
         * @return true if there is an element after the iterator position
         */
        boolean hasNext();

        /**
         * Adds an element before the iterator position
         * and moves the iterator past the inserted element.
         * 
         * @param element the element to add
         */
        void add(Object element);

        /**
         * Removes the last traversed element. This method may
         * only be called after a call to the next() method.
         */
        void remove();

        /**
         * Sets the last traversed element to a different value.
         * 
         * @param element the element to set
         */
        void set(Object element);
  }// LinkedListIterator
}//LinkedList
