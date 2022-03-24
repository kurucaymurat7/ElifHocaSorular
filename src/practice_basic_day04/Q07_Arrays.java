package practice_basic_day04;

public class Q07_Arrays {
    public static void main(String[] args) {
        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */
        int[][] array = {{0, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 1, 3}};
        int enkucuk = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < enkucuk) {
                    enkucuk = array[i][j];
                }
            }
        }
        System.out.println(enkucuk);

    }
}
