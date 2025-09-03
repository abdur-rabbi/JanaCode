/*This program showns that a binary search in an shorted array */


import java.util.*;

public class BinarySearch {

    public void binary_search(int[] data, int x, int trg) {
        int st = 0, end = x - 1, mid;
        while (st <= end) {
            mid = (st + end) / 2;
            if (trg < data[mid]) {
                end = mid - 1;
            } else if (trg > data[mid]) {
                st = mid + 1;
            } else {
                System.out.println("Element found at index: " + mid);
                return;
            }
        }
        System.out.println("Element not found.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Input array length: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Given " + n + " elements are: ");
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10) + 5;
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nAfter sorted final array is. ");
        Arrays.sort(arr);
            for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nEnter target element: ");
        int tg = input.nextInt();
        BinarySearch b = new BinarySearch();
        b.binary_search(arr, n, tg);

    }
}
