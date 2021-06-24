package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int length = nums.length;
        if(nums == null || length < 3)
            return ans;
        Arrays.sort(nums); // 排序
        for(int i = 0; i < length; i++){
            if(nums[i] > 0) break;// 如果当前数字大于0，则三数之和一定大于0，所以结束循环
            if(i > 0 && nums[i] == nums[i-1]) continue; // 去重
            int L = i + 1;
            int R = length - 1;
            while(L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    while(L<R && nums[L] == nums[L+1]) L++;
                    while(L<R && nums[R] == nums[R-1]) R--;
                    L++;
                    R--;
                } else if(sum < 0){
                    L++;
                } else if(sum > 0){
                    R--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        threeSum ans = new threeSum();
        List<List<Integer>> res = ans.threeSum(new int[]{-1,0,1,2,-1,-4});
    }
}
