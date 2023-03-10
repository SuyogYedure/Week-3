class Average{
  public static void main(String[] args){
   int arr[][]={{4,6,2,5},{7,9,4,8},{6,9,3,7}};
   int sum=0;

   float avg;
    for(int i=0;i<arr.length;i++){
       sum=sum + arr[i][3];
  }
    avg=(float)sum/(arr.length);
    System.out.println("Average is "+avg);
  }
}