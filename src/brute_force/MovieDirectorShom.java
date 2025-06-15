package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MovieDirectorShom {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int count = 1;
            int increseNum = 665;

            while (count <= n) {
                increseNum++;
                if (Integer.toString(increseNum).contains("666")) {
                  count++;
                }
            }
            System.out.println(increseNum);
    }
}
