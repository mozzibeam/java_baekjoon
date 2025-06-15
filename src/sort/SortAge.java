package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class SortAge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[][] userArr = new String[n][2];

        String[] sArr;
        for (int i = 0; i < n; i++) {
            sArr = br.readLine().split(" ");
            userArr[i][0] = sArr[0];
            userArr[i][1] = sArr[1] ;
        }

        Arrays.sort(userArr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int c1 = Integer.parseInt(o1[0]);
                int c2 = Integer.parseInt(o2[0]);
                return Integer.compare(c1, c2);
            }
        });

        for (String[] row : userArr) {
            System.out.println(row[0] + " " + row[1]);
        }
    }
}
