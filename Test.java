import java.util.Scanner;

public class Test {
    public static void Switch(int[] arr, int start, int end){
        int length = end - start;
        if(start + length %2 == 0) {
            for (int i = start; i <= (start + length) / 2; i++) {
                for (int j = end; j >= (start + length) / 2 + 1; j++) {
                    arr[i] = arr[j];
                }
            }
        }
        else {
            for (int i = start; i < (start + length) / 2; i++) {
                for (int j = end; j > (start + length) / 2; j++) {
                    arr[i] = arr[j];
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N ;i ++){
            arr[i] = i+1;
        }
        Switch(arr, A, B);
        Switch(arr, C , D);
        for(int i = 0; i < N ; i ++) System.out.print(arr[i] + " ");
    }
}
