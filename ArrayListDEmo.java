import java.util.*;

class ArrayListDemo {

    public static void main(String args[]) {

        List<String> l=new ArrayList<String>();
        l.add("red");
        l.add("green");
        l.add("blue");
        l.add("pink");
        l.add("black");
        System.out.println("My Color list   .." + l);
        System.out.println("First element :" + l.get(0));
        l.set(1,"violet");
        System.out.println("Updated My Color list   .." + l);
        l.remove(3);
        System.out.println("Updated My Color list   .." + l);
        System.out.println("Size of list..."+l.size());
       
           System.out.println("Print the elements through the normal for loop");
         //loop through an ArrayList
         for(int i=0;i<l.size();i++) 
          System.out.println(l.get(i));
          Collections.shuffle(l);
        System.out.println("Results after shuffle operation:" + l);  
        System.out.println(l);
           System.out.println("Sorting the elements");
           Collections.sort(l);
          System.out.println("Print  sorted elements through enhanced for loop");
          //loop through for each loop
          for(String i : l) 
           System.out.println(i);

             

         l.clear();
         System.out.println("After clearing all the elements My Color list   .." + l);

           





    }
}