package hot100;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day3 {
    public int longestConsecutive(int[] nums) {
        /*int count = 1;
        int Maxcount = 1;
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        for (int i = 1;i< nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }else if(nums[i]-nums[i-1]==1){
                count++;
            }else {
                count = 1;
            }
            Maxcount = Math.max(count,Maxcount);
        }
        return Maxcount;*/


        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }
        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}
