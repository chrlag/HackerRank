import java.util.*;


public class IceCreamParlor {

    static void whatFlavors(int[] cost, int money) {

        HashMap <Integer,Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < cost.length; i++){
            int value = money - cost[i];
            if(hm.containsKey(value) && hm.get(value) != i +1){
                int out = i+1;
                if (hm.get(value) >= i +1){
                    
                    System.out.println(out  + " " + hm.get(value));
                }
                else{
                    System.out.println(hm.get(value)  + " " + out);

                }
            }
            else{
                hm.put(cost[i], i + 1);
            }
        }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] cost = new int[n];

            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }

            whatFlavors(cost, money);
        }

        scanner.close();
    }
}
