import java.util.NoSuchElementException;

/**
 * An implementation of a stack as a sequence of nodes.
*/
public class LinkedListStack
{
    private Node first;

    /**
     * Constructs an empty stack.
    */
    public LinkedListStack()
    {
        first = null;
    }
    /**
     * Adds an element to the top of the stack.
     *
     * @param element the element to add
    */
    public void push (Object element)
    {
        Node n = new Node();
        n.data = element;
        n.next = first;
        first = n;
    }
    /**
        Removes the element from the top of the stack.
        @return the removed element
    */
    public Object pop ()
    {
        if (this.empty())  
            throw new NoSuchElementException();
        Object o = first.data;
        first.next = first;
        return o;
    }
    /**
     * Checks whether this stack is empty.
     *
     * @return true if the stack is empty
    */
    public boolean empty()
    {
        return first == null;
    }
    static class Node
    {
        public Object data;
        public Node next;
    }
}
