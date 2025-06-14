import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();
        String[] inputs = {s1, s2, s3};

        for (int i = 0; i < 3; i++) {
            if (isNumeric(inputs[i])) {
                int result = Integer.parseInt(inputs[i]) + (3 - i);
                if (result % 15 == 0) {
                    System.out.println("FizzBuzz");
                    break;
                } else if (result % 3 == 0) {
                    System.out.println("Fizz");
                    break;
                } else if (result % 5 == 0) {
                    System.out.println("Buzz");
                    break;
                } else {
                    System.out.println(result);
                    break;
                }
            }
        }
    }
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
