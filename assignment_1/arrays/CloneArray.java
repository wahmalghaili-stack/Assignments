package assignment_1.arrays;

public class CloneArray {
    public static int[] cloneArray(int[] original) {
        int[] clone = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            clone[i] = original[i];
        }
        return clone;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] cloned = cloneArray(arr);
        System.out.print("Cloned Array: ");
        for (int num : cloned) {
            System.out.print(num + " ");
        }
    }
}
