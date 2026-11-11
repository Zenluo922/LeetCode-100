package hot100;

import java.util.HashSet;

public class Day8 {
    public int lengthOfLongestSubstring(String s) {
        char[] array = s.toCharArray();//字符串转成数组才可用索引等操作
        HashSet<Character> set = new HashSet<>();
        int left = 0,right = 0,max = 0;
        while (right<array.length){
            if (!set.contains(array[right])){//如果没有右指针指向的集合在set中，加入set集合
                set.add(array[right]);

                max = Math.max(max,right-left+1);//记录最大长度，算法题中经常用Math.max方法记录
                right++;

                continue;
            }

            set.remove(array[left]);//如果遍历到了重复值，在set集合中移除最左边的值并且让左指针右移
            left++;
        }
        return max;
    }
}
