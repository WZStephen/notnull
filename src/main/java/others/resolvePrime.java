package others;
public class resolvePrime {
    /**
     * 分解质因数
     * @param num 待分解的数字
     * @return 分解后的数字结果
     */
    public static String resolvePrime(int num) {
        StringBuffer sb = new StringBuffer(num + "="); // 定义结果字符串缓存对象，用来保存结果字符
        int i = 2; // 定义最小素数
        // 进行辗转相除法
        while (i <= num) {
            // 若num 能整除 i ，则i 是num 的一个因数
            if (num % i == 0) {
                sb.append(i + "*"); // 将i 保存进sb 且 后面接上 *
                num = num / i; // 同时将 num除以i 的值赋给 num
                i = 2; // 将i重新置为2
            } else {
                i++;  // 若无法整除，则i 自增
            }
        }
        // 去除字符串缓存对象最后的一个*，将结果返回
        return sb.toString().substring(0, sb.toString().length() - 1);
    }
    public static void main(String[] args) {
        System.out.println(resolvePrime(90));
        System.out.println(resolvePrime(134));
        System.out.println(resolvePrime(81));
    }
}
