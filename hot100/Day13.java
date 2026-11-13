package hot100;

public class Day13 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] Newnums = new int[n];
        for (int i = 0; i < n; i++) {
            Newnums[(i+k)%n] = nums[i];
        }
        System.arraycopy(Newnums,0,nums,0,n);
    }
}
