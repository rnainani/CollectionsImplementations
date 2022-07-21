import java.util.ArrayList;
import java.util.LinkedList;

public class ListsExample {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList();
        list1.add("java");
        list1.add("selenium");
        list1.add("maven");
        list1.add("git");
        list1.add("TestNG");
        list1.add("cucumber");
        System.out.println(list1);

        LinkedList<String> list2 = new LinkedList();
        list2.add("java");
        list2.add("selenium");
        list2.add("maven");
        list2.add("git");
        list2.add("TestNG");
        list2.add("cucumber");
        System.out.println(list2);
    }
}
