import java.util.LinkedList;
import java.util.Queue;

/**
 * This program simulates a print queue. Note that documents are printed
 * in the same order as they are submitted.
*/
public class QueueDemo
{
    public static void main(String[] args)
    {
        Queue<String> jobs = new LinkedList<>();
        jobs.add("Joe");
        jobs.add("Kevin");
        jobs.add("Lennie");
        jobs.add("Melissa");
        System.out.println("First in line:"+jobs.remove());
        jobs.add("Ned");
        System.out.println("First in line:"+jobs.remove());
        System.out.println("First in line:"+jobs.remove());
        System.out.println("First in line:"+jobs.remove());
        System.out.println("The rest of the jobs: " + jobs);
    }
}
