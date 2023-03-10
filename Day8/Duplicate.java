class Duplicate {
  public static void main(String args[]) {
    int arr[] = {33,12,25,1,33,89,25,12,74,89};
    int count = 1;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
         if (arr[i] == arr[j]) {
             count++;
            arr[j] = -1;
          }
        }
     if (arr[i] != -1 && count == 1) {
       System.out.println(arr[i]);
      }
        count = 1;
    }
  }
}