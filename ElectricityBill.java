// Calculate Electricity Bill

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String Args[]) {
        int input;
        System.out.println("enter the units : ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        int output = input * 10;
        System.out.println("Your bill is " + output + "Rupees");

    }
}