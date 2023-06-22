// Calculate Average Of N Numbers

import java.util.Scanner;

public class Average {
    public static void main(String Args[]) {
        float num;
        System.out.println("Enter the number of values ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int[] array;
        float sum = 0;
        for (int i = 1; i <= num; i++) {
            Scanner src = new Scanner(System.in);
            int a = src.nextInt();
            sum = sum + a;
            array = new int[] { a };
        }
        double avg = sum / num;
        System.out.println("Average is " + avg);

    }
}
