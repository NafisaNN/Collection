public class ArrayDemo1 {
    

    public static void main(String args[]) {
          String name[]=new String[5];
           int rollno[]={11,21,33,44,55};
            name[0]="Amit";
            name[1]="Pooja";
            name[2]="rohit";
            name[3]="aqua";
            name[4]="farha";
            for(int i=0;i<5;i++) {

            System.out.print("Rollno..."+ i +"   "+ rollno[i]);
             System.out.println("    Name..."+ i +"   "+ name[i]);
            }
           


    }
}
