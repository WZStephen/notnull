import java.util.Scanner;

public class full_bTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double input = in.nextInt();

        double roof = Math.sqrt(input);
        //2^n
        boolean flag = false;
        double pow = 0;
        double res = 0;
        while(!flag){
            double tmp = Math.pow(2,pow);
            res += tmp;
            if(res > input){
                res -= tmp;
                flag = true;
            }
            pow += 1;
        }
        System.out.println(Math.round(res));
    }
}
