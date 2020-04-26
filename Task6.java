package by.belhard.j22.homeworks;

public class Task6 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double average = 0;
        if (numbers.length > 0)
        {
            double sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            average = sum / numbers.length;
            System.out.println(sum);
            System.out.println(average);
        }
    }}

