package hot100;

import java.util.Arrays;

public class Day14 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        Arrays.fill(answer, 1);
        int leftSum = 1;
        int rightSum = 1;
        int left = 0, right = n - 1;

        while (left < n && right >= 0) {
            answer[left] *= leftSum;
            answer[right] *= rightSum;

            // 修改点：leftSum 应该累乘左边走过的元素 nums[left]
            // rightSum 应该累乘右边走过的元素 nums[right]
            leftSum *= nums[left++];
            rightSum *= nums[right--];
        }
        return answer;
    }
}
