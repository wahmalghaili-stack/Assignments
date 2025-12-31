package assignment_1.arrays;

import java.util.Arrays;

public class RemoveSpecificElement {
    public static int[] removeElement(int[] arr, int element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }
        if (index == -1) return arr;

        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int elementToRemove = 30;
        int[] newArr = removeElement(arr, elementToRemove);
        System.out.println("Array after removal: " + Arrays.toString(newArr));
    }
}
