package hot100;

public class Day17 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for(int j = 0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {//i = 0：处理第一行,i = 1：处理第二行,i = 2：处理第三行
            int left = 0,right = n-1;//类似双指针，交换左右两边的元素
            while (left<right){//不能等于，考虑中间元素不移动
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }

        }
    }
}
