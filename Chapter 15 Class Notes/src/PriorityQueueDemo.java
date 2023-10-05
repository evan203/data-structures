import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        Queue<WorkOrder> todo = new PriorityQueue<>();
        todo.add(new WorkOrder(3, "Water plants"));
        todo.add(new WorkOrder(2, "Make dinner"));
        todo.add(new WorkOrder(4, "Get my money up"));
        System.out.println(todo);


    }
}
