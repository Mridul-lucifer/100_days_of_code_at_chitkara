import java.util.Scanner;

public class Distance {
    public static void main(String Args[]) {
        int int_x, int_y;
        int fin_x, fin_y;
        System.out.println("Enter Initial coorinates x and y respectively :");
        Scanner sc = new Scanner(System.in);
        int_x = sc.nextInt();
        int_y = sc.nextInt();

        System.out.println("Enter Final coorinates x and y respectively :");
        fin_x = sc.nextInt();
        fin_y = sc.nextInt();

        double dis = (fin_y - int_y) * (fin_y - int_y) + (fin_x - int_x) * (fin_x - int_x);
        double distance = Math.sqrt(dis);
        System.out.println("Distance is " + distance + "unit");
    }
}
