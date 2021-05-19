/**
 * 将⼀个字符串转换成⼀个整数(实现Integer.valueOf(string)的功能，但是string不
 * 符合数字要求时返回0)，要求不能使⽤字符串转换整数的库函数。 数值为0或者字符串不是
 * ⼀个合法的数值则返回0。
 */
public class strToInt {
    public int strToIntMethod1(String s){
        if(s.length() == 0)
            return 0;
        char[] strs = s.toCharArray();

        int flag = 0;
        if(strs[0] == '+')
            flag = 1;
        else if(strs[0] == '-')
            flag = 2;
        int start = flag > 0 ? 1 : 0;
        int ans = 0;
        for(int i = start; i < strs.length; i++){
            if(Character.isDigit(strs[i])){
                int currentDigit = strs[i] - '0';
                ans = ans*10 + currentDigit;
            }
            else{
                return 0;
            }
        }
        return flag != 2 ? ans : -ans;
    }
    public int strToIntMethod2(String s){
        return Integer.valueOf(s);
    }
    public static void main(String[] args) {
        strToInt obj = new strToInt();
        System.out.println(obj.strToIntMethod1("-12312312"));
        System.out.println(obj.strToIntMethod2("-12312312"));

    }
}
