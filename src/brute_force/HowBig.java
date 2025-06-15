package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HowBig {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] intArr = new int[n][2];
        int[] eachGrade = new int[n];
        Arrays.fill(eachGrade, 1);


        String[] s = new String[2];
        for (int i = 0; i < n; i++) {
                s = br.readLine().split(" ");
            intArr[i][0] = Integer.parseInt(s[0]);
            intArr[i][1] = Integer.parseInt(s[1]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (intArr[i][0] - intArr[j][0] < 0 && intArr[i][1] - intArr[j][1] < 0) {
                        eachGrade[i] += 1;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int grade : eachGrade) {
            sb.append(grade).append(" ");
        }
        System.out.println(sb);
    }
}