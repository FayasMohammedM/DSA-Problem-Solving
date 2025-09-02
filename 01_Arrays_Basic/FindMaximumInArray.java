// Problem: Largest Element in Array
// Link: https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0
// Difficulty: Basic
// Objective: Find the largest element in a given array.

public class LargestElementInArray {

    // Function to return the largest element
    static int largest(int arr[], int n) {
        int lar = -1; // initialize with smallest possible
        for (int i = 0; i < n; i++) {
            if (arr[i] > lar) {
                lar = arr[i];
            }
        }
        return lar;
    }

    // Test the function
    public static void main(String[] args) {
        int[] arr1 = {1, 8, 7, 56, 90};
        int[] arr2 = {5, 5, 5, 5};
        int[] arr3 = {10};

        System.out.println("Largest in arr1: " + largest(arr1, arr1.length)); // 90
        System.out.println("Largest in arr2: " + largest(arr2, arr2.length)); // 5
        System.out.println("Largest in arr3: " + largest(arr3, arr3.length)); // 10
    }
}
