import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockAndTheValidString {

    static String isValid(String s) {

        String answer = "NO";

        if (s == null){
            return answer;
        }

        s.toLowerCase();

        int [] freq = new int[26];

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        Arrays.sort(freq);
        int index = 0;
        while (freq[index] == 0){
            index++;
        }

        int min = freq[index];
        int max = freq[freq.length - 1];

        if (min == max){
            answer = "YES";
        }
        else if ((max - min == 1) && (max > freq[24])
                || (min == 1) && freq[index + 1] == max){
            answer = "YES";

        }

        return answer;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
