package BasicProgramming.InputOutput.BasicsOfInputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PrimeNumber {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int N = nextInt();
        if (N == 1)
            System.exit(0);
        boolean[] prime = new boolean[N + 1];
        Arrays.fill(prime, true);
        for (int i = 2; i * i < N + 1; i++) {
            if (prime[i]) {
                for (int j = i * i; j < N + 1; j += i) {
                    prime[j] = false;
                }
            }
        }
        for (int i = 2; i < N + 1; i++) {
            if (prime[i])
                pw.print(i + " ");
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