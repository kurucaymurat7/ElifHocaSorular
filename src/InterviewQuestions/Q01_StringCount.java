package InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_StringCount {
    public static void main(String[] args) {
        String str;
        char c = ' ';
        int count = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        str = scan.nextLine();

        //String Manipulation
        for (c = 'a'; c <= 'z'; c++) {
            count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (c == str.substring(i, i + 1).charAt(0)) {
                    count++;
                }
            }
            if (count != 0) {
                System.out.println(c + " = " + count);
            }
        }

        //Array ile
        String[] array = new String[str.length()];
        array = str.split("");
        for (c = 'a'; c <= 'z'; c++) {
            count = 0;
            for (int i = 0; i < array.length; i++) {
                if (c == array[i].charAt(0)) {
                    count++;
                }
            }
            if (count != 0) {
                System.out.println(c + " ==== " + count);
            }
        }

        //Arrays farklı yöntem. Daha iyi.
        Arrays.sort(array);
        count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i-1].equals(array[i])) {
                count++;
            } else {
                System.out.println(array[i-1] + " = " + (count + 1));
                count = 0;
            }
            if (i==array.length) {
                System.out.println(array[i] + " = " + count + 1);
            }
        }
    }

}
