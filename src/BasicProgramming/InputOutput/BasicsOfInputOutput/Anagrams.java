package BasicProgramming.InputOutput.BasicsOfInputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Anagrams {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int t = nextInt();
        while (t-- != 0) {
            String str1 = nextLine();
            String str2 = nextLine();
            int[] arr = new int[26];
            for (int i = 0; i < str1.length(); i++)
                arr[str1.charAt(i) - 'a']++;
            for (int i = 0; i < str2.length(); i++)
                arr[str2.charAt(i) - 'a']--;
            int cnt = 0;
            for (int i = 0; i < 26; i++)
                cnt += Math.abs(arr[i]);
            pw.println(cnt);
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