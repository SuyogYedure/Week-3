import java.util.Scanner;
class Adddivsubmul {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
     int num1, num2;
      System.out.println("Enter the num1: ");
  num1=s.nextInt();
      System.out.println("Enter the num2: ");
  num2=s.nextInt();
      System.out.println("Enter the operator:+,-,*,/");
     char ch =s.next().charAt(0);
    switch (ch)  {
       
        
        case '+':
        {
         System.out.println("Addithon of two numbers is : " + (num1 + num2));
         break;
        }
        case '-':
        {
        System.out.println("Substraction of two numbers is : " + (num1 - num2));
         break;
        }
        case '*':
        {
        System.out.println("Multiplication of two numbers is : " + (num1 * num2));
         break;
        }
        case '/':
        {
        System.out.println("Division of two numbers is : " + (num1 / num2));
         break;
        }
        default:
            {
              System.out.println("Invalid Operator");
            }
        }
  }
}
   