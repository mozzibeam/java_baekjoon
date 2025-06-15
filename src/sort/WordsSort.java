package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class WordsSort {
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
        };

        String[] newArr = new String[set1.size()];
        int index = 0;
        for (String s : set1) {
            newArr[index++] = s;
        }

        String strTemp = "";

        for (int i = 0; i < newArr.length; i++) {
            for (int j = i+1; j < newArr.length; j++) {
                if (newArr[i].length() > newArr[j].length()) {
                    strTemp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = strTemp;
                } else if (newArr[i].length() == newArr[j].length()) {
                    if (newArr[i].compareTo(newArr[j]) > 0) {
                        strTemp = newArr[i];
                        newArr[i] = newArr[j];
                        newArr[j] = strTemp;
                    }
                }
            }
        }


        for (String s : newArr) {
            System.out.println(s);
        }
    }
}
