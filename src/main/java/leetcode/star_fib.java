package leetcode;

/**
 F(0) = 0,   F(1) = 1
 F(N) = F(N - 1) + F(N - 2), 其中 N > 1.

 我们可以使用动态规划，将每次前两数之和存起来，便于下次直接使用，这样子，
 我们就把一个栈溢出的问题，变为了单纯的数学加法，大大减少了内存的压力。
 */
public class star_fib {
    public int fib(int n) {
        int a = 0, b = 1, sum;
        for(int i = 0; i < n; i++){
            sum = (a + b) % 1000000007; //1e9+7最大内存
            a = b;
            b = sum;
        }
        return a;
    }

    public static void main(String[] args) {
        star_fib obj = new star_fib();
        System.out.println(obj.fib(5));
    }
}
