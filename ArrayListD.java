import java.util.*;
public class ArrayListD {
    
    public static void main(String args[]  ) {
           ArrayList<String> l=new ArrayList<String>();
           System.out.println("List of countries.....");
           l.add("US");
           l.add("Africa");
           l.add("Syria");
           l.add("France");
           l.add("Italy");

           System.out.println(" List of countries..." + l);
    
            l.set(1,"America");
           System.out.println("After updating List using normal for loop...");
           for(int i=0;i<l.size();i++) 
                System.out.println(l.get(i));

                l.remove(2);
                Collections.sort(l);

          System.out.println("After Removing object List using Enhanced for loop ....");
          for(String s : l)
               System.out.println(s);

         System.out.println("Print the list through Iterator ....");

           Iterator<String> i=l.listIterator();

           while(i.hasNext()) 
              {
                String s1=i.next();
                System.out.println(s1);
              }

              l.clear();
              System.out.println("After clearing the list :" + l);
             
   }
}
