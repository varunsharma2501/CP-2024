import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2MaxHeap {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(-1, 5, 1, 7, 6, 9, 3));
        int n = arr.size();

        buildMaxHeap(arr, n);

        for (int i = 1; i < arr.size(); i++) {
            System.out.print(arr.get(i) + "->");
        }

        System.out.println("\nThe maximum element is " + getMax(arr));

        insert(arr, 12);

        for (int i = 1; i < arr.size(); i++) {
            System.out.print(arr.get(i) + "->");
        }
        System.out.println("\nThe maximum element is " + getMax(arr));

        deleteRoot(arr);
        for (int i = 1; i < arr.size(); i++) {
            System.out.print(arr.get(i) + "->");
        }
        System.out.println();
        deleteNode(arr, 6);
        for (int i = 1; i < arr.size(); i++) {
            System.out.print(arr.get(i) + "->");
        }
    }

    public static void buildMaxHeap(List<Integer> arr, int n) {
        // Starting from the last non-leaf node and moving upwards
        for (int i = n / 2; i >= 1; i--) {
            maxHeapify(arr, i, n);
        }
    }

    public static void maxHeapify(List<Integer> arr, int ind, int n) {
        int left = 2 * ind; // Left child
        int right = 2 * ind + 1; // Right child
        int largest = ind; // Initialize largest as root

        // If left child is larger than root
        if (left < n && arr.get(left) > arr.get(largest)) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr.get(right) > arr.get(largest)) {
            largest = right;
        }

        // If largest is not root
        if (largest != ind) {
            // Swap arr[ind] and arr[largest]
            int temp = arr.get(ind);
            arr.set(ind, arr.get(largest));
            arr.set(largest, temp);

            // Recursively heapify the affected sub-tree
            maxHeapify(arr, largest, n);
        }
    }

    public static int getMax(List<Integer> arr) {
        return arr.get(1);
    }

    public static void insert(List<Integer> arr, int n) {
        arr.add(n);
        int i = arr.size() - 1;
        while (i > 1 && arr.get(i / 2) < arr.get(i)) {
            // swap arr[i] and arr[parent(i)]
            int temp = arr.get(i);
            arr.set(i, arr.get(i / 2));
            arr.set(i / 2, temp);
            i = i / 2;
        }
    }

    public static void deleteRoot(List<Integer> arr) {
        int n = arr.size();

        // Swap root with last element
        int temp = arr.get(1);
        arr.set(1, arr.get(n - 1));
        arr.set(n - 1, temp);

        // Remove the last element (former root)
        arr.remove(n - 1);

        // Re-heapify the tree
        maxHeapify(arr, 1, arr.size());
    }

    public static void deleteNode(List<Integer> arr, int n) {
        int i;
        for (i = 0; i < arr.size(); i++) {
            if (arr.get(i) == n) {
                arr.set(i, Integer.MAX_VALUE);
                break;
            }
        }
        // now we need to bubble it up to the top
        while(i>=1 && arr.get(i)>arr.get(i/2)){
            int temp=arr.get(i);
            arr.set(i,arr.get(i/2));
            arr.set(i/2,temp);
        }

        deleteRoot(arr);
}
    
    
}
