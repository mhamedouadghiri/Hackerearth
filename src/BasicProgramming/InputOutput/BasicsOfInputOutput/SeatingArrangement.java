package BasicProgramming.InputOutput.BasicsOfInputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class SeatingArrangement {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int T = nextInt();
        while (T-- != 0) {
            int n = nextInt();
            int x = n % 12;
            switch (x) {
                case 1:
                    pw.println(n + 11 + " WS");
                    break;
                case 2:
                    pw.println(n + 9 + " MS");
                    break;
                case 3:
                    pw.println(n + 7 + " AS");
                    break;
                case 4:
                    pw.println(n + 5 + " AS");
                    break;
                case 5:
                    pw.println(n + 3 + " MS");
                    break;
                case 6:
                    pw.println(n + 1 + " WS");
                    break;
                case 7:
                    pw.println(n - 1 + " WS");
                    break;
                case 8:
                    pw.println(n - 3 + " MS");
                    break;
                case 9:
                    pw.println(n - 5 + " AS");
                    break;
                case 10:
                    pw.println(n - 7 + " AS");
                    break;
                case 11:
                    pw.println(n - 9 + " MS");
                    break;
                case 0:
                    pw.println(n - 11 + " WS");
                    break;
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