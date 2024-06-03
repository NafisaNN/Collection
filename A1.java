import java.util.*;

public class A1 {
    public static void main(String args[]) {
        LinkedList<String> a = new LinkedList<>();
        a.add("red");
        a.add("Green");
        a.add("blue");
        System.out.println(a);
        for (String obj : a) {
            System.out.println(obj);
        }
        Collections.sort(a);
        System.out.println(a);

        System.out.println(a.reversed());

    }
}