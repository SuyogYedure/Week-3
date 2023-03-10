import java.util.Scanner;
class Delete{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int arr[]={23,45,67,78,45,7,90,22};
    System.out.println("Enter the value:");
    int key = s.nextInt();
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=key){
        System.out.print(arr[i]+" ");
      }
    }
  }
}