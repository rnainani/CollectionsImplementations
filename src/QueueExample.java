import java.util.PriorityQueue;

public class QueueExample
{
    public static void main(String[] args) {
        PriorityQueue<String> q1 = new PriorityQueue<>();
        q1.add("sample");
        q1.add("text");
        q1.add("goes here");
        System.out.print(q1);
    }
}
