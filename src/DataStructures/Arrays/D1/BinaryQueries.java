package DataStructures.Arrays.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BinaryQueries {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int n = nextInt();
        int q = nextInt();
        int[] a = Arrays.stream(nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        while (q-- != 0) {
            int[] l = Arrays.stream(nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (l[0] == 1) {
                a[l[1] - 1] ^= 1;
            } else if (l[0] == 0) {
                pw.println(a[l[2] - 1] == 0 ? "EVEN" : "ODD");
            }
        }
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