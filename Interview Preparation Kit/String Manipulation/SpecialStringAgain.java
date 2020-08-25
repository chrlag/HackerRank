import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SpecialStringAgain {

    static long substrCount(int n, String s) {

        long count = 0;

        if (s == null){
            return count;
        }

        count += n;

        for (int i = 0; i < n; i++){
            char start_char = s.charAt(i);
            int diff_char = -1;

            for (int j = i + 1; j < n; j++){
                char curr_char = s.charAt(j);

                if(start_char == curr_char){
                    if((diff_char == -1) || ((j - diff_char) == (diff_char - i))){
                        count++;
                    }

                }
                else{
                    if(diff_char == -1){
                        diff_char = j;
                    }
                    else{
                        break;
                    }
                }
            }
            


        }
        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

