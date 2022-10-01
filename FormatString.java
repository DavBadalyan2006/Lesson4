public class FormatString {
    public static void main(String[] args){
        System.out.printf("%d and %f\n", 5, 7.8);
        System.out.println();
        System.out.printf("" + 5 + " and " + 7.8);
        System.out.println();
        System.out.printf("%.2f and %.2f\n", 5.5355345435, 7.8);
        System.out.printf("%c - \\\\ %03d", 'a', 4);
    }
}
