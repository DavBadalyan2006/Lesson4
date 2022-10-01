import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Test1 {
    public static List<Integer> MoveNegatives(List<Integer> corrected, int n) {
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        result2 = corrected;
        for (int i = 0; i < n; i++) {
            int temp = corrected.get(i);
            if (temp < 0) {
                result1.add(temp);
                result2.remove(i);
            }
        }
        ArrayList<Integer> merge = new ArrayList<Integer>();
        merge.addAll(result1);
        merge.addAll(result2);
        return(merge);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> corrected = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            corrected.set(i, sc.nextInt());
        }
        ArrayList<Integer> merge = new ArrayList<Integer>();
        merge = (ArrayList<Integer>) MoveNegatives(corrected, n);
        for (int i = 0; i < n; i++) System.out.print(merge.get(i) + " ");
    }
}
