import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    static long repeatedString(String s, long n) {
        
        long count = 0;
        long count_mod = 0;

        long modulo = n % s.length();

        long times = n / s.length();
        System.err.println("Times = " + times);

        String sub = s.substring(0, (int)modulo);
        System.err.println("Modulo = " + modulo);


        if (n < s.length()){
            for (int i = 0; i <sub.length(); i++){
                char c = sub.charAt(i);
                if (c == 'a'){
                    count_mod++;
                }
            }
            return count_mod;
        }

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == 'a'){
                count++;
                System.err.println(count);
            }
        }

        for (int i = 0; i <sub.length(); i++){
            char c = sub.charAt(i);
            if (c == 'a'){
                    count_mod++;
            }
        }
        
        return count*times + count_mod;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
