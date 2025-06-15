package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class SortCoordinate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] sArr = new String[n];
        int[][] coordiArr = new int[n][2];
        for (int i = 0; i < n; i++) {
            sArr = br.readLine().split(" ");
            coordiArr[i][0] = Integer.parseInt(sArr[0]);
            coordiArr[i][1] = Integer.parseInt(sArr[1]);
        }

        Arrays.sort(coordiArr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a1, int[] a2) {
                if (a1[0] != a2[0]) {
                    return Integer.compare(a1[0], a2[0]);
                }
                return Integer.compare(a1[1], a2[1]);
            }
        });

        for (int[] row : coordiArr) {
            System.out.println(row[0] + " " + row[1]);
        }
    }
}
