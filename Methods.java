import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double a1 = x1 * x1;
        double b1 = y1 * y1;
        double c1 = Math.sqrt(a1 + b1);

        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double a2 = x1 * x1;
        double b2 = y1 * y1;
        double c2 = Math.sqrt(a2 + b2);
        System.out.println(c2 > c1 ? "FIRST" : "SECOND");
    }
}
