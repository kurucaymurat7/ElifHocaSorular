package practice_basic_day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q11_ArraysList {


    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

         */


        // 1.adımda Listemizi rastgele oluşturalım.
        List<String> usernameList = new ArrayList<>();
        usernameList.add("Ali");
        usernameList.add("Ahmet");
        usernameList.add("Veli");
        usernameList.add("Mehmet");
        usernameList.add("Ayse");
        usernameList.add("Selma");
        usernameList.add("Fatma");
        usernameList.add("Nur");

        //2. adım: Kullanıcıdan username alalım.
        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi giriniz = ");
        String username = scan.nextLine();

        //////////////////// Username Kontrolü. ////////////////////

        String bosluksuzUserName = "";
        if (username.contains(" ")) {
            username = bosluguSil(username); //username bir ya da birden fazla space içeriyorsa, bosluguSil metodu ile bosluklardan kurtulalım.
        }

        //Eger girilen username, List'de kayıtlı ise, sonuna rastgele random bir sayi atayarak, Listeye kaydedelim ve kullanıcıya gösterelim.
        if (usernameList.contains(username)) {
            Random r = new Random(); //random sınıfı
            int ekleneceksayi = r.nextInt(100);
            username = username.concat(String.valueOf(ekleneceksayi));
            System.out.println("Bu isim Listede kayıtlı.");
        }

        usernameList.add(username);
        System.out.println("Kullanici adiniz " + username +" olarak kaydedildi...");

        System.out.println(usernameList);

    }

    public static String bosluguSil(String username) {
        int uzunluk = username.length();
        String yeniUserName = "";
        int bosluksayisi = 0;
        for (int i = 0; i < uzunluk; i++) {
            if (username.charAt(i) == ' ') {
                bosluksayisi++;
            }
        }
        int spacesayisi = 0;
        for (int i = 0; i < uzunluk - bosluksayisi; i++) {
            if (!(username.charAt(i + spacesayisi) == ' ')) {
                yeniUserName = yeniUserName.concat(username.substring(i + spacesayisi, i + spacesayisi + 1));
            } else {
                spacesayisi++;
                yeniUserName = yeniUserName.concat(username.substring(i + spacesayisi, i + spacesayisi + 1));
            }
        }
        System.out.println(yeniUserName);
        return yeniUserName;
    }

}
