public class test {
    public String ret(int input){
        StringBuilder ans = null;
        String tmp = String.valueOf(input);
        int len = tmp.length();
        for(int i = len-1; i >= 0; i--){
            char index = tmp.charAt(i);

        }
        return null;
    }
    public static void main(String[] args) {
        test obj = new test();
        System.out.println(obj.ret(15));
    }
}
