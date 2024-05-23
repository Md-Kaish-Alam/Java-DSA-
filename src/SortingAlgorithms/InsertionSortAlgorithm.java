package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {10, 34, -9, -78, 0, 12, -89, 56};

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swapping(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    public static void swapping(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
