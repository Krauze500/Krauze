package by.belhard.j22.homeworks;

public class Task21 {
    public static void main(String[] args) {
        int[] pif = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int x : pif) {
            for (int y : pif) {
                System.out.printf("%4d", (x * y));
            }
            System.out.println();
        }}}