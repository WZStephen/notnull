package leetcode;

/**
 * 给定⼀个字符串，验证它是否是回⽂串，只考虑字⺟和数字字符，可以忽略字⺟
 * 的⼤⼩写。 说明：本题中，我们将空字符串定义为有效的回⽂串。
 */
public class isPalindrome {
    public boolean isPalindrome(String s){
        if(s.length() == 0)
            return true;
        int l = 0, r = s.length()-1;
        while(l < r){
            // 从头和尾开始向中间遍历
            if(!Character.isLetterOrDigit(s.charAt(l))){ //左边字符不是字⺟和数字的情况
                l++;
            } else if(!Character.isLetterOrDigit(s.charAt(r))){ //右边字符不是字⺟和数字的情况
                r--;
            } else{
                if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) // 判断⼆者是否相等
                    return false;
                l++;
                r--;
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
