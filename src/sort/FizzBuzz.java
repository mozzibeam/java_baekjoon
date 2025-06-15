package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class FizzBuzz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] sArr = new String[n];
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = br.readLine();
        }

        Set<String> set1 = new HashSet<>();
        for (String s : sArr) {
            set1.add(s);
        }
        System.out.println();

        int length = sArr[0].length();
        String strTemp = "";
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i].length() < length) {
                length = sArr[i].length();
                strTemp = sArr[i];
                sArr[i] = sArr[0];
                sArr[0] = strTemp;
            }
        }


        for (String s : set1) {
            System.out.println(s);
        }
    }
}
