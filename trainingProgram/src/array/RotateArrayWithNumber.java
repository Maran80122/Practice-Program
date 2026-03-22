package array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayWithNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = s.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Enter key value:");
        int key = s.nextInt();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Number not found");
            return;   // 🔴 VERY IMPORTANT
        }

        int[] rotate = new int[n];
        int j = 0;

        for (int i = index; i < n; i++) {
            rotate[j++] = arr[i];
        }

        for (int i = 0; i < index; i++) {
            rotate[j++] = arr[i];
        }

        System.out.println(Arrays.toString(rotate));
    }
}
