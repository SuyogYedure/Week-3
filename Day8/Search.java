import java.util.Scanner;
class Search {
  public static void main(String args[]) {
    int arr[] = {23,56,58,89,78,12,54,14};
    int count = 0, index = -1;
     Scanner s = new Scanner(System.in);
      System.out.println("Enter the value ");
     int key = s.nextInt();
    for (int i = 0; i < arr.length; i++) {
      if (key == arr[i]) {
         count++;
         index = i;
         break;
      }
    }
    if (count != 0) {
      System.out.println("Yes, it is present in " + index + " index");
   }
    else {
      System.out.println("It is not present");
    }
  }
}