package leetcode;

import java.util.HashSet;
import java.util.Set;

public class star_findRepeatNumber {
    public int findRepeatNumber(int[] nums){
//        for(int i = 0; i <= nums.length-1; i++){
//            for(int j = i + 1; j <= nums.length-1; j++){
//                if(nums[i] == nums[j])
//                    return nums[i];
//            }
//        }
//        return -1;
/**
 * HashSet 基于 HashMap 来实现的，是一个不允许有重复元素的集合。
 * HashSet 允许有 null 值。
 * HashSet 是无序的，即不会记录插入的顺序。
 * HashSet 不是线程安全的， 如果多个线程尝试同时修改 HashSet，则最终结果是不确定的。 您必须在多线程访问时显式同步对 HashSet 的并发访问。HashSet 实现了 Set 接口。
 **/
        Set<Integer> set = new HashSet<Integer>();
        int repeat = -1;
        for(int i = 0; i <= nums.length-1; i++){
            if(!set.add(nums[i])){
                repeat = nums[i];
                break;
            }
        }
        return repeat;
    }
    public static void main(String[] args) {
        star_findRepeatNumber ans = new star_findRepeatNumber();
        ans.findRepeatNumber(new int[]{3,1,2,3});
    }
}
