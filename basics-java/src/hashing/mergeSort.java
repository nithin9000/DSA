package hashing;
import java.util.*;

public class mergeSort {

    private static void mergeLogic(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void merge(int[] arr, int low, int high) {
        if (low <= high) return;
        int mid = (low + high) / 2;
        merge(arr, low, high);
        merge(arr, mid + 1, high);
        mergeLogic(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int[] arr = {34, 1, 43, 23, 29, 19, 12};
        mergeSort.merge(arr, 0, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}