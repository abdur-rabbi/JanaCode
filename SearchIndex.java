/* This is a simple Java program to find the index of a target number in a sorted array. */

import java.util.*;

public class SearchIndex {
    public int search(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input array length: ");
        int x = input.nextInt();
        int[] arr = new int[x];
        System.out.print("Input " + x + " array elements: ");
        for (int j = 0; j < x; j++) {
            arr[j] = input.nextInt();
        }
        System.out.print("Enter search number: ");
        int n = input.nextInt();
        SearchIndex s = new SearchIndex();
        System.out.print("The index of the number is: " + s.search(arr, n));
    }

}
