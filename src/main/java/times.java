import java.util.Scanner;

public class times {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //10
        int input = in.nextInt();
        int[][] times = new int[input][2];
        for(int i = 0; i < input; i++){
            times[i][0] = in.nextInt();
            times[i][1] = in.nextInt();
        }
        int res = 0;
        for(int i = 0; i < input; i++){
            int a_i = times[i][0];
            int b_i = times[i][1];
            if(a_i <= b_i){
                res += a_i;
            }else{
                res += b_i;
            }
        }
        System.out.println();
    }
}
