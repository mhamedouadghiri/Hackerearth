package DataStructures.HashTables.BasicsOfHashTables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class MaximumSum {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int N = nextInt();
        List<Long> A = new ArrayList<>();
        for (int i = 0; i < N; i++)
            A.add(nextLong());
        Set<Long> set = new HashSet<>();

        long best = Long.MIN_VALUE, sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                if (i != j) {
                    sum = Math.max(sum + A.get(j), A.get(j));
                    best = Math.max(best, sum);
                } else {
                    sum = A.get(j);
                    best = A.get(j);
                }
                set.add(best);
            }
        }

        pw.println(set.stream().mapToLong(Long::longValue).sum());
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