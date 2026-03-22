package methods;

		

public class SumOf2Arrays {


		    public static int[] sumArrays(int[] a, int[] b) {
		        int n = a.length;
		        int[] sum = new int[n];

		        for (int i = 0; i < n; i++) {
		            sum[i] = a[i] + b[i];
		        }

		        return sum;
		    }

		   public static void main(String[] args) 
		   {
		        int[] arr1 = {10, 20, 30, 40, 50};
		        int[] arr2 = {1, 2, 3, 4, 5};

		        int[] result = sumArrays(arr1, arr2);

		        System.out.print("Sum of arrays: ");
		        for (int val : result) {
		            System.out.print(val + " ");
		        }
		    }
		}


