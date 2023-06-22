// Calculate Commission Percentage

import java.util.Scanner;

public class Commission {
    public static void main(String Args[]) {
        int sp, cp;
        System.out.println(
                "Enter the Selling Price , Cost Price and Commission percentage of the Service or Goods (Respectively)");
        Scanner sc = new Scanner(System.in);
        sp = sc.nextInt();
        cp = sc.nextInt();
        double com_per = sc.nextInt();
        double Commission = (sp - cp) * com_per;
        System.out.println("The Commission Generated on Profit Is " + Commission + "Units");
    }
}
