import java.util.*;

public class BubbleSort {
    public void bubble_Sort(int[] data, int x) {
        int j, k, temp;
        System.out.print("\nAfter bubble sort array elements are: ");
    for (j = 0; j < x - 1; j++){
        for (k = 0; k < x - 1 - j; k++){
            if (data[k] > data[k + 1]){
                temp = data[k];
                data[k] = data[k + 1];
                data[k + 1] = temp;
            }
        }
        System.out.print(data[j]+" ");
    }
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Input array length: ");
        int i, n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Before bubble sort Array elements are: ");
        for (i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10) + 5;
            System.out.print(arr[i] + " ");
        }
        BubbleSort bs = new BubbleSort();
        bs.bubble_Sort(arr, n);
    }
}
