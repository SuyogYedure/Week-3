class Rating{
  public static void main(String args[]){
    int arr[][]={{4,6,2,5},{7,9,4,8},{6,9,3,7}};
    int max = arr[0][0];
    for(int i=0; i<arr.length;i++){
      for(int j=0; i<arr[i].length;j++){
        if (max<arr[i][j]){
          max = arr[i][j];
        }
      }
    }
    System.out.println("Maximum Rating is "+max);
  }
}