package Algorithms.DynamicProgramming.IntroductionToDynamicProgramming1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class IntelligentGirl {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int[] aa = Arrays.stream(nextLine().split("")).mapToInt(Integer::parseInt).toArray();
        int[] a = IntStream.range(0, aa.length).map(i -> aa[aa.length - i - 1]).toArray();
        dp[0] = (a[0] % 2) ^ 1;
        for (int i = 1; i < a.length; i++)
            dp[i] = dp[i - 1] + (1 ^ (a[i] % 2));
        for (int i = 0; i < a.length; i++)
            pw.print(dp[a.length - i - 1] + " ");
        pw.close();
    }

    private static int[] dp = new int[10001];

    private static final long MOD = (long) (Math.pow(10, 9) + 7);

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    private static String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    private static String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    private static int nextInt() {
        return Integer.parseInt(next());
    }

    private static long nextLong() {
        return Long.parseLong(next());
    }

    private static double nextDouble() {
        return Double.parseDouble(next());
    }
}