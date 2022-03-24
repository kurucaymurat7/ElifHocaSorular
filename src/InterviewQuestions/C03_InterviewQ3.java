package InterviewQuestions;

public class C03_InterviewQ3 {
    public static void main(String[] args) {
        ///*
        //Ask user enter a positive number and check if it is prime or not
        //Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
        // */

        int sayi = 2;
        boolean asalMi = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalMi = false;
            }
        }
        if (asalMi) System.out.println("asal");
        else System.out.println("asal degil");
    }
}
