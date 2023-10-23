import java.util.NoSuchElementException;

/**
    An implementation of a queue as a circular array.
*/
public class CircularArrayQueue
{
    //private data
    private Object[] elements;
    int head;
    int tail;
    int currentSize;
    /**
        Constructs an empty queue.
    */
    public CircularArrayQueue()
    {
        this.currentSize = 0;
        this.elements = new Object[10];
        this.head = 0;
        this.tail = 0;
    }
    /**
        Checks whether this queue is empty.
        @return true if this queue is empty
    */
    public Boolean empty()
    {
        return this.currentSize==0;
    }
    /**
        Adds an element to the tail of this queue.
        @param newElement the element to add
    */
    public void add(Object element)
    {
        if (this.currentSize == this.elements.length)
            this.growIfNecessary();
        this.elements[this.tail] = element;
        this.tail++;
        this.tail %= this.elements.length; // wrap around
        this.currentSize++;
    }
    /**
        Removes an element from the head of this queue.
        @return the removed element
    */
    public Object remove()
    {
        if (this.empty())
            throw new NoSuchElementException();
        int r = this.head;
        this.head++;
        this.head %= this.elements.length;
        this.currentSize--;
        return this.elements[r];
    }
    /**
        Grows the element array if the current size equals the capacity.
    */
    private void growIfNecessary()
    {
        if(this.currentSize == this.elements.length)
        {
            Object[] newElements = new Object[2 * this.elements.length];
            for(int i = 0; i < this.elements.length; i++)
            {
                newElements[i] = this.elements[(head + i) % this.elements.length];
            }
            this.elements = newElements;
            this.head = 0;
            this.tail = this.currentSize;
        }
    }
}//CircularArrayQueue
