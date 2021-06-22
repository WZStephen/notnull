package alibaba;

import java.util.Arrays;
/**
你将会获得一系列视频片段，这些片段来自于一项持续时长为T秒的体育赛事。这些片段可能有所重叠，也可能长度不一。
视频片段clips[i]都用区间进行表示：开始于clips[i][0]并于clips[i][1]结束。我们甚至可以对这些片段自由地再剪辑，例如片段[0, 7]可以剪切成[0, 1] +[1, 3] + [3, 7]三部分。
我们需要将这些片段进行再剪辑，并将剪辑后的内容拼接成覆盖整个运动过程的片段（[0, T]）。返回所需片段的最小数目，如果无法完成该任务，则返回-1 。
 输入：clips = [[0,2],[4,6],[8,10],[1,9],[1,5],[5,9]], T = 10
 输出：3
* */
public class a41_videoStitching {
    public int videoStitching(int[][] clips, int time) {
        int[] dp = new int[time + 1];
        Arrays.fill(dp, Integer.MAX_VALUE - 1);
        dp[0] = 0;
        for (int i = 1; i <= time; i++) {
            for (int[] clip : clips) {
                if (clip[0] < i && i <= clip[1]) {
                    dp[i] = Math.min(dp[i], dp[clip[0]] + 1);
                }
            }
        }
        int test = Integer.MAX_VALUE;//2147483647
        return dp[time] == Integer.MAX_VALUE - 1 ? -1 : dp[time];
    }

    public static void main(String[] args) {
        a41_videoStitching obj = new a41_videoStitching();
        System.out.println(obj.videoStitching(new int[][]{{0,2},{4,6},{8,10},{1,9},{1,5},{5,9},}, 10));
    }
}
