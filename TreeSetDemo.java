import java.util.*;  
public class TreeSetDemo{  
public static void main(String args[]){  
//Creating and adding elements  
TreeSet<String> set=new TreeSet<>();  
set.add("Ravi");  
set.add("Vijay");  
set.add("Ravi");  
set.add("Ajay");  
//set.add(null);
//traversing elements  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  