package hot100;

public class Day18 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int row = 0,col = n-1;//从第一排，右边的最大值开始找
        while (row<m && col>=0){
            if (matrix[row][col]==target){
                return true;
            }else if (matrix[row][col]>target){//如果比t大，应该向左移
                col--;
            }else {//如果比t小就向下移
                row++;
            }
        }
        return false;//循环完还没有相等的就为false
    }
}
