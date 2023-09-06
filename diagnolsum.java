public class diagnolsum {
        public static void main(String[] args) {
          int a[][] =  { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
          diagonalSum(a);
        }
        public static void diagonalSum(int[][] a) {
          int sum = 0;
          for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
              if(i == j) {
                sum += a[i][j];
              }
            }
          }
          System.out.print(sum);
        }
      }
      

