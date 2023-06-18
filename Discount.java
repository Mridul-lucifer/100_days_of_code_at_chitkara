import java.util.Scanner;

public class Discount {
    public static void main(String Args[]) {
        int sp, mrp;
        System.out.println("Enter the Selling Price And M.R.P :");
        Scanner sc = new Scanner(System.in);
        sp = sc.nextInt();
        mrp = sc.nextInt();
        double discount = ((mrp - sp) * 100) / mrp;
        System.out.println("Discount is " + discount + "%");

    }
}
