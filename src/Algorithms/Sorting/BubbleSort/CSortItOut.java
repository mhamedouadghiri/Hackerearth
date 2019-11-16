package Algorithms.Sorting.BubbleSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class CSortItOut {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int m = nextInt();
        int[][] pairs = new int[m][2];
        for (int i = 0; i < m; i++)
            pairs[i] = new int[]{nextInt(), i};
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[0]));
        for (int[] e : pairs)
            pw.print(e[1] + " ");
        pw.close();
    }

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