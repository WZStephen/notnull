
/**
 小强现在有n个物品，么个物品有两种属性xi和yi.他想从中挑出尽可能多的物品满足一下条件：对于任意两个物品
 i和j满足xi < xj 且 yi < yj或者xi > xj且 yi > yj。问最多挑出多少物品


 第一行输入一个正整数TT.表示有TT组数据.
 对于每组数据,第一行输入一个正整数nn.表示物品个数.
 接下来两行,每行有nn个整数.
 第一行表示nn个节点的xx属性.
 第二行表示nn个节点的yy属性.
 1 <= 10
 2 <= n <= 100000
 0 <= x, y <= 1000000000

 输出T行,每一行对应每组数据的输出.
 * **/


import java.io.*;
import java.util.*;

public class Alibaba_q1{
    //排序器，将X从小到大排序，最关键的一步是将相同的X按Y从大到小排序，因为如果按Y从小到大排序，
    //会导致后面的大的Y覆盖末尾前面的小的Y，这样就不符合贪心算法的尽量保证末尾元素最小的要求了。
    private static Comparator<int[]> comparator = new Comparator<int[]>(){
        @Override
        public int compare(int[] o1,int[] o2){
            if (o1[0] > o2[0]) return 1;
            else if (o1[0] < o2[0]) return -1;
            else {
                if (o1[1] > o2[1]) return -1;
                else if (o1[1] == o2[1]) return 0;
                else return 1;
            }
        }
    };

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int n = Integer.parseInt(str);
        for (int i = 0; i < n; i++){
            String str1 = bf.readLine();
            int m = Integer.parseInt(str1);
            String[] str2 = bf.readLine().split(" ");
            String[] str3 = bf.readLine().split(" ");
            int[][] items = new int[m][2];
            for (int j = 0;j < m;j++){
                items[j] = new int[]{Integer.parseInt(str2[j]),Integer.parseInt(str3[j])};
            }

            //对数组排序
            Arrays.sort(items,comparator);
            //res保存最长递增子序列的大小。
            int res = 1;
            //用来保存每个长度末尾的Y尽可能小的[x,y]数组。
            int[][] dp = new int[m + 1][2];
            dp[1] = items[0];
            //二分法进行查找此时的Y刚刚好大于哪一个下标的Y，又小于下一个下标的Y，这样更改下一个下标
            //的Y，为此时的Y，就可以保证dp数组保存的是末尾可能的最小的Y。这种方法相对于DP寻找最长
            //递增子序列，更快，时间复杂度为O(nlogn)
            for (int j = 1;j < m;j++){
                if (dp[res][1] < items[j][1]) dp[++res] = items[j];
                else if (dp[res][1] > items[j][1]){
                    int l = 1,r = res,pos = 0;
                    while (l <= r){
                        int mid = (l + r) >> 1;
                        if (dp[mid][1] < items[j][1]){
                            pos = mid;
                            l = mid + 1;
                        }else{
                            r = mid - 1;
                        }
                    }
                    if (dp[pos][0] != items[j][0]) dp[pos + 1] = items[j];
                }
            }
            System.out.println(res);
        }
    }
}

