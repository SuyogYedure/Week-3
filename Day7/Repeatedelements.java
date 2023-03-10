import java.util.Scanner;
class Repeatedelements {  
public static void main(String[] args) {  
        
        int arr[] = {55,225,23,55,31,89,55,26,23};
        int search = 0,count=0;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the element to check how many times it is repeated"); 
        search=s.nextInt();
      
          for(int i = 0; i < arr.length; i++) {  
            if(search==arr[i]){  
              count++; 
            }  
        }
         if (count>0)
         {
           System.out.println("Element is present in array "+count+" times" );
         }
         else{
           System.out.println("Element is not present");
         }
    }  
}  