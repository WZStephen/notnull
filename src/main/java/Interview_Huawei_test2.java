import java.util.HashMap;
import java.util.Scanner;
//字符串生成
public class Interview_Huawei_test2 {
    //"abbcccbaa" --> (a(bb(ccc)b)aa) --> 3次
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        HashMap<Character, Integer> cat = new HashMap<>();
        for(int i = 0; i < input.length(); i++){
            if(cat.containsKey(input.charAt(i))){
                int count = cat.get(input.charAt(i)) + 1;
                cat.put(input.charAt(i), count);
            } else{
                cat.put(input.charAt(i), 1);
            }
        }
        int n = cat.size();
        System.out.println(n);
    }
}
