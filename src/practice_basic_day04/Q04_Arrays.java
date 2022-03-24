package practice_basic_day04;

public class Q04_Arrays {
    public static void main(String[] args) {
        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
         * istenenToplam=9;
         */

        int[] array = {5,7,-6,4,2,15,3,8,1};
        int istenenToplam = 9;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] + array[j] == 9) {
                    System.out.println(array[i] + " " + array[j] + " = " + istenenToplam);
                }
            }
        }
    }

}
			/*
			5 and 4 sum is 9
			7 and 2 sum is 9
			-6 and 15 sum is 9
			8 and 1 sum is 9
			 */