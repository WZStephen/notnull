package leetcode;
public class TEST {
    public int a7_reverseInt(int input){
        int res = 0;
        while(input != 0){
            int index = input % 10;
            input /= 10;
            res = res*10 + index;
        }
        return res;
    }

    public String reverseString(int input){
        String in = String.valueOf(input);
        StringBuilder res = new StringBuilder();
        String res1;
        for(int i = in.length()-1; i >= 0; i--){
            char index = in.charAt(i);
            res.append(index);
            /**
             Java反射
             文件夹路径递归搜索
             * */
        }

        return res.toString();
    }
    public static void main(String[] args) {
        a7_reverseInt obj = new a7_reverseInt();
        System.out.println(obj.a7_reverseInt(51));
        System.out.println(obj.reverseString(51));
    }
}
