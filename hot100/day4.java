package hot100;
//283
public class day4 {
    public static void main(int[] nums) {
        for (int i = 0, j = 0; j < nums.length; j++) {
            if(nums[j]!=0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
    }
}
