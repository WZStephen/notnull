package alibaba;

/**
 给定一个n，求 [1,n] 这 n 个数字的排列组合有多少个。
 条件：相邻的两个数字的绝对值不能等于1.
 例如：
 4
 [2, 4, 1, 3]
 [3, 1, 4, 2]
 * */

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class judge {
    static List<List<Integer>> res;
    public static void main(String[] args) {
        res = new LinkedList<>();
        // write your code here
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        int nums[] = new int[N];
        judge(N, nums, 0, new LinkedList<Integer>());
        for(List<Integer> list : res){
            System.out.println(list);
        }
    }
    public static void judge(int n, int[] nums, int index, List<Integer> list){
        if(index == n){
            res.add(new LinkedList<Integer>(list));
            return;
        }
        for (int i = 1; i <= n; i++) {
            if(nums[i-1] == 0 && (list.size() == 0 || Math.abs(list.get(list.size()-1)-i) != 1)){
                list.add(i);
                nums[i-1] = 1;
                judge(n, nums, index+1, list);
                list.remove(list.size()-1);
                nums[i-1] = 0;
            }
        }
    }
}
