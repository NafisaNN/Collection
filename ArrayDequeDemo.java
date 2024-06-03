import java.util.*;  
public class ArrayDequeDemo {  
   public static void main(String[] args) {  
   //Creating Deque and adding elements  
   Deque<String> deque = new ArrayDeque<String>();  
   deque.add("Ravi");    
   deque.add("Vijay");     
   deque.add("Ajay");  
   deque.offer("Anaya");
   deque.offerFirst("Heena");
   deque.offerLast("Pooja");
   //Traversing elements  
   for (String str : deque) {  
   System.out.println(str);  
   }  
   System.out.println(" retrive the  first and last objects from the deque..");
   System.out.println("First OBject :" + deque.peekFirst());
   System.out.println("Last OBject :" + deque.peekLast());

    deque.removeFirst();
    deque.removeLast();
  System.out.println("After removing first and last object from the deque..");
    for (String str : deque) {  
   System.out.println(str);  


   
   }
   }  
}  