package hot100;

import java.util.ArrayList;
import java.util.Arrays;

public class Day12 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));//将数组排序
        ArrayList<int[]> list = new ArrayList<>();
        int leftStart = intervals[0][0],rightStrat = intervals[0][1];//设置第一对数组为初始值
        for (int i = 1; i < intervals.length; i++) {
            int left = intervals[i][0];
            int right = intervals[i][1];
            if (left<=rightStrat){//如果第二对左边小于第一对的右边。则可以合并
                rightStrat = Math.max(rightStrat,right);//比较两组第二个数谁大谁做新区间的第二个数
            }else {
                list.add(new int[]{leftStart,rightStrat});//添加数组到列表
                leftStart = left;//将下一对数组设为初始值
                rightStrat = right;
            }
        }
        list.add(new int[]{leftStart,rightStrat});// 循环结束后，别忘了把最后一个合并区间放进去
        return list.toArray(new int[list.size()][]);

    }
}
