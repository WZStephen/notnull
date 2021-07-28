package leetcode;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        StringBuffer sb = new StringBuffer(num+"=");
        int i =2;
        while(i <= num){
            if(num%i==0){
                sb.append(i + "*");
                num = num / i;
                i = 2;
            } else {
                i++;
            }
        }

        System.out.println(sb.substring(0,sb.length()-1));

        //System.out.println(sb.toString().subString(0, length));
        //sb.toString().subString(0,sb.toString().length()-1);
    }
}
