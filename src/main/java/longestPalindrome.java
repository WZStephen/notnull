

public class longestPalindrome {
    public String longestPalindrome(String s) {
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        String ans = "";
        for(int l = 0; l < length; ++l){
            for(int i = 0; i + l < length; ++i){
                int j = i + l;
                if(l == 0){
                    dp[i][j] = true;
                } else if(l == 1){
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i+1][j-1]);
                }
                if(dp[i][j] && l + 1 > ans.length()){
                    ans = s.substring(i, i + l + 1);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        longestPalindrome op = new longestPalindrome();
        String result = op.longestPalindrome("cbbd");
        System.out.println();
    }
}
