package sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        QuickSort.QuickSort(intArray, 0, intArray.length);

        Arrays.stream(intArray).forEach(System.out::println);

    }

    public static void QuickSort(int[] arr, int start, int end){
        if(end - start < 2) return;

        int partitionIndex = partition(arr, start, end);
        QuickSort(arr, start, partitionIndex);
        QuickSort(arr, partitionIndex +1, end);
    }

    private static int partition(int[] arr, int start, int end){
        int i = start;
        int j = end;

        int pivot=arr[start];

        while(i <j){
            while(i<j && arr[--j]>=pivot);
            arr[i] = arr[j];

            while(i<j && arr[++i]<=pivot);
            arr[j] = arr[i];
        }
        arr[j] = pivot;
        return j;
    }
}
