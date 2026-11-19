import java.util.ArrayList;
import java.util.List;

public class Day16 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int leftLimit = 0, rightLimit = col - 1;
        int upLimit = 0, downLimit = row - 1;

        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true) {

            // 1. 向右
            for (int i = leftLimit; i <= rightLimit; i++) {
                list.add(matrix[upLimit][i]);
            }
            upLimit++;

            if (list.size() == row * col) return list;

            // 2. 向下
            for (int j = upLimit; j <= downLimit; j++) {
                list.add(matrix[j][rightLimit]);
            }
            rightLimit--;

            if (list.size() == row * col) return list;

            // 3. 向左
            for (int i = rightLimit; i >= leftLimit; i--) {
                list.add(matrix[downLimit][i]);
            }
            downLimit--;

            if (list.size() == row * col) return list;

            // 4. 向上
            for (int j = downLimit; j >= upLimit; j--) {
                list.add(matrix[j][leftLimit]);
            }
            leftLimit++;

            if (list.size() == row * col) return list;

        }
    }
}
