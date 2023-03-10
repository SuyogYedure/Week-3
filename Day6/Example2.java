import java.util.Scanner;
class Example2 {
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter week number to print week day");
    int week_num=s.nextInt();
    switch(week_num){
      case 1:
        {
          System.out.println("Monday");
          break;
        }
      case 2:
        {
          switch(2)
            {
              case 1:
                {
                  System.out.println("this is inner case 1");
                }
              case 2:
                { 
                  System.out.println("this is inner case 2");
                }
            }
          break;
        }
      default:
        {
          System.out.println("Invalid week number");
        }
    }
  }
}