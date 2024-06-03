import java.util.*;  
class HashTableDemo{  
 public static void main(String args[]){  
  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
  
  hm.put(100,"Amit");  
  hm.put(102,"Ravi");  
  hm.put(101,"Vijay");  
  hm.put(103,"Rahul");  
  
  for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  

  hm.remove(100);
  System.out.println("After removing 100.. " + hm);

  System.out.println(hm.getOrDefault(101, "Not Found"));  
  System.out.println(hm.getOrDefault(105, "Not Found"));  
  hm.putIfAbsent(104,"Gaurav");  
  System.out.println("Updated Map: "+hm);  
  //Returns the current value, as the specified pair already exist  
  hm.putIfAbsent(101,"Farha");  
  System.out.println("Updated Map: "+hm);

  
 }  
}  