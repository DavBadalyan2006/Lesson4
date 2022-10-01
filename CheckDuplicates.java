import java.util.ArrayList;
import java.util.List;

public class CheckDuplicates {
    public static void main(String[] args) {
        int arrayIn[] = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates = findDuplicates(arrayIn);
        System.out.println(duplicates);
    }

    private static List<Integer> findDuplicates(int[] arrayIn) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arrayIn.length; i++) {
            int index = Math.abs(arrayIn[i]) - 1;
            if (arrayIn[index] < 0)
                result.add(index);
            arrayIn[index] = -arrayIn[index];
        }
        return result;
    }
}
