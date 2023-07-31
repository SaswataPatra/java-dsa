import java.util.*;

public class Hackathon1 {
    public static void main(String[] args) {
        String arr[] = new String[300000];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            arr[i] = sc.nextLine();
            if (arr[i].length() > 20) {
                arr[i] = sc.nextLine();
            }
        }
        hulks_classroom(arr, n, k);

    }

    public static void hulks_classroom(String[] arr, int n, int k) {
        int i = 0, j = 0;
        // for (i = 0, j = 1; i < n; j++) {
        // if (arr[i].length() == arr[j].length()) {
        // System.out.println(arr[i] + " " + arr[j]);
        // }
        // if ((j - i) == k || j == n) {
        // i++;
        // j = i;
        // }
        // System.out.println("hello");
        // }
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j <= i + k && j < n; j++) {

                if (arr[i].length() == arr[j].length()) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
                System.out.println("Hello");
            }
        }

    }
}
