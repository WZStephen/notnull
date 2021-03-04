public class addDigits {
    public int addDigits(int num) {
        if(num == 0)
            return 0;
        return num % 9 == 0 ? 9 : num % 9;
    }

    public static void main(String[] args) {
        addDigits op = new addDigits();
        op.addDigits(38);
    }
}
