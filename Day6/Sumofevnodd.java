class Sumofevnodd{
    public static void main(String[] args) {
      int arr[]={23,45,12,90,55,33};
      int n, sumE = 0, sumO = 0;
    
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                sumE = sumE + arr[i];
            }
            else
            {
                sumO = sumO + arr[i];
            }
        }
        System.out.println("Sum of Even Numbers:"+sumE);
        System.out.println("Sum of Odd Numbers:"+sumO);
    }
}