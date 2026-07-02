import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        // Creating an ArrayList of Integer type
        List<Integer> list = new ArrayList<>();

        // Adding elements
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Original List: " + list);

        // Adding another element
        list.add(4);

        System.out.println("Updated List: " + list);
    }
}