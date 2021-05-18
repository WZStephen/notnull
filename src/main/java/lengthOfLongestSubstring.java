import java.util.HashMap;

public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        if(s.length()==0)
            return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left_index = 0;
        for(int i=0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                int t = map.get(s.charAt(i)) + 1;
                left_index = Math.max(left_index, map.get(s.charAt(i)) + 1);
                System.out.println();
            }
            map.put(s.charAt(i), i);
            ans = Math.max(ans, i-left_index+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring op = new lengthOfLongestSubstring();
        int result = op.lengthOfLongestSubstring("abcabcbb");
        System.out.println(result);
    }
}
