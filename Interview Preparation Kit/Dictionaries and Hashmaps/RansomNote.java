import java.util.*;

public class RansomNote {

    static void checkMagazine(String[] magazine, String[] note) {

        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        for (String s : magazine){

            if(!hm.containsKey(s)){
                hm.put(s,1);
            }
            else{
                hm.put(s, hm.get(s) + 1);
            }
        }

        for (String k : note){
            if(hm.containsKey(k) && (hm.get(k) != 0)){
                hm.put(k, hm.get(k) - 1);
            }
            else{
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
