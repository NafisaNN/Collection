import java.util.*;  
public class StackDemo{  
public static void main(String args[]){  
Stack<String> stack = new Stack<>();  

stack.push("Ayush");  
stack.push("Garvit");  
stack.push("Amit");  
stack.push("Ashish");  
stack.push("Garima");  
System.out.println("Current stack ...." + stack);
stack.pop();  

System.out.println( "Print Stack Elements through iterator method...");

Iterator<String> itr=stack.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  

String topElement = stack.peek();
System.out.println("Topmost element ..." + topElement);

System.out.println("Index of  Amit.." + stack.search("Amit"));

System.out.println("Size of stack...." + stack.size());

System.out.println("Print stack elements through for each...");

System.out.println("Print Stack elements using enhanced for loop...");
for (String data : stack) {
    System.out.println(data);
}


System.out.println("Print stack elements through List Iterator...");
ListIterator<String> ListIterator = stack.listIterator(stack.size());  

while (ListIterator.hasPrevious())   
{  
String avg = ListIterator.previous();  
System.out.println(avg);  
}  




}  
}  
