class Addition {
public static void main(String[] args) {
        int rows = 2, columns = 3;
        int firstMatrix[][] = {{3,8,9},{6,7,3}};
        int secondMatrix[][] = {{4,6,7},{2,4,6}};
  
        int sum[][] = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}