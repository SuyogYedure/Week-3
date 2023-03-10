import java.util.Scanner;
class Search{  
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
    		int i,n,search,flag=0;
		    int arr[] = {23,45,12,90,55,33};
		
		System.out.println("Enter the element to be searched");
		search = s.nextInt();
    
    		for(i=0;i<arr.length;i++)
    		{
        		if(arr[i]==search)
        		{
            			System.out.println("Element "+search+" found at "+i+" position");
            			flag=1;
            			break;
        		}
    		}
    		if(flag==0)
    		{
        		System.out.println("Element "+search+" not found");
    		}
	}
}