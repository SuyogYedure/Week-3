class Sumofrow {
  public static void main(String args[]) {
    int arr[][] = { { 2,8,9,7,5 }, { 4,2,6,7,8 } };
    for (int i = 0; i < arr.length; i++) {
      int sum = 0;
      for (int j = 0; j < arr[i].length; j++) {
        sum = sum + arr[i][j];
       }
      System.out.println("the sum of the elements in row " + i + " is " + sum);
    }
  }
}