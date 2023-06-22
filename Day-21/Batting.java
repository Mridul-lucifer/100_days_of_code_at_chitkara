import java.util.Scanner;

public class Batting {
    public static void main(String Args[]) {
        int runs, matches, Outs;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Total Scores : ");
        runs = sc.nextInt();
        System.out.print("Enter the Total Matches Played : ");
        matches = sc.nextInt();
        System.out.print("Enter the Number of Outs : ");
        Outs = sc.nextInt();

        double avg = runs / (matches - Outs);
        System.out.println("Batting Averge Appoxly comes out to be " + avg);

    }
}
