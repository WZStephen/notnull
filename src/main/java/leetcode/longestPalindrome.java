package leetcode;

/**
 * 给定⼀个包含⼤写字⺟和⼩写字⺟的字符串，找到通过这些字⺟构造成的最⻓
 * 的回⽂串。在构造过程中，请注意区分⼤⼩写。⽐如 "Aa" 不能当做⼀个回⽂字符串。注
 * 意:假设字符串的⻓度不会超过 1010。
 * 回⽂串：“回⽂串”是⼀个正读和反读都⼀样的字符串，⽐如“level”或者“noon”等等就是回⽂
 * 串。
 *
 * 动态规划
 */
public class longestPalindrome {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        int begin = 0;
        // dp[i][j] 表示 s[i..j] 是否是回文串
        boolean[][] dp = new boolean[len][len];
        // 初始化：所有长度为 1 的子串都是回文串
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        char[] charArray = s.toCharArray();
        // 递推开始
        // 先枚举子串长度
        for (int L = 2; L <= len; L++) {
            // 枚举左边界，左边界的上限设置可以宽松一些
            for (int i = 0; i < len; i++) {
                // 由 L 和 i 可以确定右边界，即 j - i + 1 = L 得
                int j = L + i - 1;
                // 如果右边界越界，就可以退出当前循环
                if (j >= len) {
                    break;
                }

                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                // 只要 dp[i][L] == true 成立，就表示子串 s[i..L] 是回文，此时记录回文长度和起始位置
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    public static void main(String[] args) {
        longestPalindrome op = new longestPalindrome();
        String result = op.longestPalindrome("cbbd");
        System.out.println(result);
    }
}
