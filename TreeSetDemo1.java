import java.util.*;  
public class TreeSetDemo1{ 
 public static void main(String args[]){  
  //Creating and adding elements  
  String s[]={"mona","seema","aqua"};
  TreeSet<String> al=new TreeSet<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  //Traversing elements  
  System.out.println(al);

  al.addAll(Arrays.asList(s));

   System.out.println(" After adding elements of s arrays..." + al);
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  

