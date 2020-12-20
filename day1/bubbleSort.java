import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of elements");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements seperated by space");
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        scanner.close();
        System.out.println("Non sorted array");
        for (int ar : arr)
            System.out.print(ar + " ");
        System.out.println("\nSorted array");
        doBubbleSort(arr);
        for (int ar : arr)
            System.out.print(ar + " ");
        System.out.println();

    }

    static int[] doBubbleSort(int[] origArr) {
        for (int i = 0; i < origArr.length - 1; i++)
            for (int j = 0; j < origArr.length - i - 1; j++)
                if (origArr[j] > origArr[j + 1]) {
                    origArr[j] = origArr[j] + origArr[j + 1];
                    origArr[j + 1] = origArr[j] - origArr[j + 1];
                    origArr[j] = origArr[j] - origArr[j + 1];
                }
        int[] sortedArr = origArr;
        return sortedArr;
    }
}
