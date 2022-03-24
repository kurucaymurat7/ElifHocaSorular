package practice_basic_day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q12_ArraysList {
    public static void main(String[] args) {

        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("kac elemanlı array gireceginizi yazınız");
        int elemanSayisi = scan.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < elemanSayisi; i++) {
            System.out.println("lutfen list a girmek ıstedıgınız sayıları tuslayınız");

            list.add(Integer.valueOf(scan.next()));



        }
        System.out.println(list);

        List<Integer> yenilist = new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            if (!yenilist.contains(list.get(i))){
                yenilist.add(list.get(i));
            }
        }
        System.out.println(yenilist);

    }
}
