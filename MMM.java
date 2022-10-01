import java.util.Scanner;


public class MMM {
    static double x2, y2, c2; //class scope

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        compare(x1, y1);
    }

    static void compare(double x1, double y1){
        double c1 = x1*x1 + y1*y1; //method scope
        double c2 = x2*x2 + y2*y2; //method scope vs class scope

        if(c1 > c2){
            double out = Math.sqrt(c1); //block scope
            System.out.println("Result: " + out);
        }
    }
}
