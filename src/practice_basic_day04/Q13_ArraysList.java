package practice_basic_day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q13_ArraysList {
    public static void main(String[] args) {

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */

        int[] input = {1,2,3,4,3,6,2,0};
        Arrays.sort(input);
        int n = 2;

        for (int i = 1; i <= n; i++) {
            System.out.println(input[input.length - i]);
        }
    }

}
