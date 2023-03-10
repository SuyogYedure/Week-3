class Sorting {
  public static void main(String args[]) {
    int arr[] = { -7,-1,-5,-2,5,2,4,6,9,10 };
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        int temp = 0;
         if(arr[j]<0){
            if (arr[i] < arr[j]) {
               temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
      }
  }
         else{
            if (arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }
     System.out.println("After Sorting the elements are: ");
       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+ " ");
       }
   }
}