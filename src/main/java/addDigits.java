/**
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 */
public class addDigits {
    public int addDigits(int num) {
        if(num == 0)
            return 0;
        return num % 9 == 0 ? 9 : num % 9;
    }

    public static void main(String[] args) {
        addDigits op = new addDigits();
        System.out.println(op.addDigits(38));
    }
}
