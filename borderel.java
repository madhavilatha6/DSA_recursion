public class borderel{
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int rowcol = 3;
        int sum = 0;
        for(int i = 0;i < rowcol ;i++){
            for(int j = 0;j<rowcol;j++){
                if(i == 0 || j == 0 || i == rowcol-1 || j == rowcol -1){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.print(sum + "  ");
    }
}