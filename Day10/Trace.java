import java.util.Scanner;
class Trace {
  public static void main(String[] args) {

    int arr[][] = { {5,8,9},{8,5,2},{8,9,10}};
    int sum=0;
     for (int i = 0; i < arr.length; i++)
      {
      for (int j = 0; j < arr[i].length; j++)
        if(i==j){
          sum=sum+arr[i][j];
         }
       }
     System.out.println("Trace of the matrix is:"+sum);
  }
}

