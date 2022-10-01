import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int length = sc.nextInt();
        int[][] a = new int[height][length];
        for (int t = 0; t < height * length; t++) {
            int i = t / length;
            int j = t % length;
            a[i][j] = i * j;
            System.out.printf("%3d%s", a[i][j], j == length - 1 ? "\n" : "");
        }
    }
}
