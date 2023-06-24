package sorting;

import java.util.*;
import java.util.stream.Stream;

public class MergeSort {
    List<Integer> list1 = Arrays.asList(1,2,4);
    List<Integer> list2 = Arrays.asList(1,3,4);

    public static void main(String[] args) {
       MergeSort ms = new MergeSort();
        int[] list = Stream.concat(ms.list1.stream(), ms.list2.stream()).mapToInt(Integer::intValue).toArray();
        int start = 0;
        int end = list.length;
        mergeSort(list, start, end);

        Arrays.stream(list).forEach(System.out::println);
    }

    private static void mergeSort(int[] list, int start , int end) {
        if((end - start) < 2) return;

        int mid = (end + start)/2;
        mergeSort(list, start, mid);
        mergeSort(list, mid+1, end);
        merge(list, start, mid, end);
    }

    public static void merge(int[] list, int start, int mid, int end){
        if(list[mid-1] < list[mid]){
            return;
        }

        int i = start;
        int j = mid;

        int tempIndex = 0;
        int[] temp = new int[list.length];

        //creating temp arry to merge in the list array
        while(i < mid && j < end){
            temp[tempIndex++] = (list[i] <= list[j])?list[i++]:list[j++];
        }

        //adding the left side array elements to the list since we dont need to add the right side ones,
        // coz they are already sorted
        System.arraycopy(list, i, list, start+tempIndex, mid-i);

        //mering the temp array with the list array
        System.arraycopy(temp, 0, list, start, tempIndex);
    }
}
