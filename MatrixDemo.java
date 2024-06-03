public class MatrixDemo {
    public static void main(String args[]) {

     int n[][]= {

                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
     };

         System.out.println("First value of the matrix.."+ n[0][0]);
          System.out.println("Last value of the matrix.."+ n[2][2]);


          for(int i=0;i<3;i++) {
              for(int j=0;j<3;j++) {
                System.out.print(n[i][j]+"   ");

              } //inner loop end
              System.out.println();
          }  // out for loop end


    }
}
