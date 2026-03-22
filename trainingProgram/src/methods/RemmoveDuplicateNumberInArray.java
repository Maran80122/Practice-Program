package methods;
public class RemmoveDuplicateNumberInArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 40};
        int[] temp = new int[arr.length];

        int k = 0; // index for temp array

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < k; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[k] = arr[i];
                k++;
            }
        }

        // Print unique elements
        for (int i = 0; i < k; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
