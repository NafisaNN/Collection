import java.util.*;  
class TreeMapDemo{  
 public static void main(String args[]){  
   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(100,"Amit");    
      map.put(102,"Ravi");    
      map.put(101,"Vijay");    
      map.put(103,"Rahul");    
        
      for(Map.Entry m:map.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
      }    

      map.remove(100);
      System.out.println(" After removing 100 : " + map);
      System.out.println("Descending MAp : " + map.descendingMap());
      System.out.println("headMap: 102... "+map.headMap(102,true));  
      System.out.println("tailMap: 102... "+map.tailMap(102,true));  
      System.out.println("subMap: 100 to 102"+map.subMap(100,true, 102,true));   
 }  
}  