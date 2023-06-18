
// Calculate Depreciation of Value
import java.util.Scanner;

public class Depreciation {
    public static void main(String Args[]) {
        float pv, cv;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Purchasing Value :");
        pv = sc.nextInt();
        System.out.println("Enter the Current Market Value :");
        cv = sc.nextInt();

        float dv = ((pv - cv) / pv) * 100;
        System.out.println("The Depreciation Value is " + dv + "%");
    }
}
