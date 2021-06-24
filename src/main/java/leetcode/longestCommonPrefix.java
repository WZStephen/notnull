package LeetCode;

import java.util.Arrays;

/**
 编写一个函数来查找字符串数组中的最长公共前缀。
        如果不存在公共前缀，返回空字符串 ""。*/

/**
 * 先利⽤Arrays.sort(strs)为数组排序，再将数组第⼀个元素和最后⼀个元素的字符从
 * 前往后对⽐即可！
 */
public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs){
        int len = strs.length;
        StringBuilder res = new StringBuilder();
        Arrays.sort(strs); // // 给字符串数组的元素按照升序排序(包含数字的话，数字会排在前⾯)
        int m = strs[0].length(); //第一个
        int n = strs[len-1].length(); //最后一个
        int num = Math.min(m, n);
        for(int i = 0; i < num; i++){
            if(strs[0].charAt(i) == strs[len-1].charAt(i))
                res.append(strs[0].charAt(i));
            else
                break;
        }
        return res.toString();
    }
    public static void main(String[] args) {
        longestCommonPrefix obj = new longestCommonPrefix();
        System.out.println(obj.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}
