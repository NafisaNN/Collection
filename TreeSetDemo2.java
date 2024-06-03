import java.util.*;
public class TreeSetDemo2 {
    public static void main(String args[]) {

        TreeSet<Integer> t=new TreeSet<>();
        Integer n[]={19,16,21};
        t.add(12);
        t.add(22);
        t.add(65);
        t.add(23);
        System.out.println("Original tree" + t);
        t.addAll(Arrays.asList(n));

        System.out.println("After adding elements from integer arrays...");
        Iterator i=t.iterator();
        while(i.hasNext())
       System.out.println(i.next());
        
         System.out.println("Ceiling :" +t.ceiling(20));
          System.out.println("Higher :" +t.higher(22));
          System.out.println("floor :" +t.floor(20));
           System.out.println("lower :" +t.lower(19));
         System.out.println("pollFirst :" +t.pollFirst());
          System.out.println("PollLast :" +t.pollLast());
          
           SortedSet st1=t.subSet(10,20);
           System.out.println(" Sorted set st1..."+st1);
          System.out.println("First element of st1.."+ st1.first());
           System.out.println("Last element of st1.."+ st1.last());
           System.out.println("size of st1.."+ st1.size());

           SortedSet tailSet= t.tailSet(10);
           System.out.println("Tail set from 10..." + tailSet);
           System.out.println("Tails set ..." + tailSet.tailSet(20));



         Iterator it= t.descendingIterator();
         while(it.hasNext())
            System.out.println(it.next());

        TreeSet<Integer> t1=new TreeSet<>(t.descendingSet());
        System.out.println("Elements of new tree se t1 in descending order..");
        System.out.println(t1);
 
        SortedSet st=t.headSet(22,true);
        System.out.println("New Sorted set here the elelements are less than 22.." + st);


         
    }


    }

