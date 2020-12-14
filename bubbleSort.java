public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = { 4, 45, 2652, 2465, 6, 246, 24 };
        System.out.println("Non sorted array");
        for (int ar : arr)
            System.out.print(ar + " ");
        System.out.println("\nSorted array");
        int[] sorArr = doBubbleSort(arr);
        for (int ar : sorArr)
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
