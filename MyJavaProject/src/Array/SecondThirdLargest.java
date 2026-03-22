package Array;

public class SecondThirdLargest {
	public static void findSecondAndThirdLargest(int[] arr) {


	if (arr.length < 3) {
        System.out.println("Array should have at least 3 elements.");
        return;
    }

    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;
    int third = Integer.MIN_VALUE;

    for (int num : arr) {
        if (num > first) {
            third = second;
            second = first;
            first = num;
        } else if (num > second && num != first) {
            third = second;
            second = num;
        } else if (num > third && num != second && num != first) {
            third = num;
        }
    }

    if (second == Integer.MIN_VALUE || third == Integer.MIN_VALUE) {
        System.out.println("Second or third largest element not found (not enough distinct values).");
    } else {
        System.out.println("Second largest: " + second);
        System.out.println("Third largest: " + third);
    }
}

public static void main(String[] args) {
    int[] arr = {12, 34, 10, 34, 1, 45};
    findSecondAndThirdLargest(arr);
 }
}
	