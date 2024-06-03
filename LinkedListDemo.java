import java.util.*;
public class LinkedListDemo {
    public static void main(String args[]) {

        LinkedList<String> courses=new LinkedList<String>();
        courses.add("C");
        courses.add("C++");
        courses.add("HTML");    
        courses.add("JAVA");
        courses.add("SQL");
        courses.add("C");
                


        System.out.println("Print the list...");
        System.out.println(courses);

         System.out.println("Object present at 2 index :" + courses.get(1));
         System.out.println("First Occurence of C :" + courses.indexOf("C"));
         System.out.println("Last Occurence of C :" + courses.lastIndexOf("C"));        courses.addFirst("Python"); 
        System.out.println("First element :" + courses.getFirst());
        System.out.println(courses);


        courses.addLast("Spring");
        System.out.println("List element :" + courses.getLast());
        System.out.println(courses);
   

        System.out.println("after removing first element ...");
        courses.removeFirst();
        System.out.println(courses);
        System.out.println(courses);

        System.out.println("after removing last element ...");
        courses.removeLast();
        System.out.println(courses);
        System.out.println(courses);





         


    }
}
