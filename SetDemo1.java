import java.util.*;
public class SetDemo1 {
     public static void main(String args[]) {
         Set<String> s=new HashSet<>();

         String other_subject[]= {"GK","computer","value education"};

         s.add("science");
         s.add("social");
         s.add("maths");
         s.add("English");

         System.out.println(s);

         s.addAll(Arrays.asList(other_subject));
         System.out.println("After adding all string objects :" + s);


         Set<String> s1=new HashSet<String>(s);
            System.out.println("After adding all elements from existing set :");
         System.out.println(s1);



       


     }
}
