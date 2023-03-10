class Sum {
  public static void main(String args[]){
    int arr[]={23,45,12,90,55,33};
     
       int sum=0;
    for (int i=0;i<arr.length;i++){
        sum = sum + arr[i];
    }
    System.out.println("The sum of elements is : " +sum);
    
    }
    
}