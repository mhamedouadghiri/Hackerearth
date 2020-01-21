package BasicProgramming.InputOutput.BasicsOfInputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CostOfBalloons {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int T = nextInt();
        while (T-- != 0) {
            int green = nextInt();
            int purple = nextInt();
            int n = nextInt();
            int p1 = 0, p2 = 0;
            for (int i = 0; i < n; i++) {
                if (nextInt() == 1)
                    p1++;
                if (nextInt() == 1)
                    p2++;
            }
            pw.println(Math.max(p1, p2) * Math.min(green, purple) + Math.min(p1, p2) * Math.max(green, purple));
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