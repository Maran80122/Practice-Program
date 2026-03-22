package practice;
;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int a[] = {1, 1, 3, 4, 53, 2,1};

        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;

            // check if a[i] appeared before
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // print only if it's the first occurrence
            if (!isDuplicate) {
                System.out.print(a[i] + " ");
            }
            
        }
    }
}
