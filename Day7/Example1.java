class Example1{
  public static void main(String args[]){
    int arr[] = {23,45,12,90,55,33};
    for (int i=0; i<arr.length; i++){
      if (arr[i]%2==0){
        arr[i] = arr[i] +5;
      }
      else{
        arr[i] = arr[i] - 5;
      }
    }
    for (int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}