package KS2013.Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://codingcompetitions.withgoogle.com/kickstart/round/0000000000434944/0000000000434c05
 *
 * @author Joseph Yuanhao Li
 * @date 5/10/21 17:30
 */
public class Moist {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            // read number of test cases
            int t = Integer.parseInt(br.readLine());

            // count variable to show test case number we solving
            int count = 0;

            // run while loop until we finish all the test cases
            while (t > 0){
                count++;

                // here goes our main logic to read input and solve program
                int n = Integer.parseInt(br.readLine());

                String[] cards = new String[n];
                for(int i = 0; i < n; i++){
                    cards[i] = br.readLine();
                }

                System.out.printf("Case #%d: %d\n", count, cost(cards));

                t--;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static int cost(String[] cards){
        int ans = 0;

        String max = cards[0];

        for(int i = 1; i < cards.length; i++){

            if(cards[i].compareTo(max) < 0) ans++;
            else max = cards[i];
        }

        return ans;
    }
}
