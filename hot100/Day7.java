package hot100;

public class Day7 {
    public int trap(int[] height) {
        int right = height.length-1;
        int left = 0;//索引
        int rightMax = 0;//声明指针
        int leftMax = 0;
        int area = 0;

        while (left<right){
            if (height[left]<height[right]){//当左边元素比右边元素小，移动左指针
                if (height[left]>leftMax){//元素比指针大就将当前元素赋值给指针，
                    leftMax=height[left];
                }else {//一旦当元素比指针小，就会形成水坑，容积为指针所被赋值的数-当前元素（相等时相减为0，不影响容积）
                    area+=leftMax-height[left];
                }
                left++;
            }else {//当左边元素比右边元素大或者相等时，移动右指针
                if (height[right]>rightMax){
                    rightMax=height[right];
                }else {
                    area+=rightMax-height[right];
                }
                right--;
            }
        }
        return area;
    }
}
