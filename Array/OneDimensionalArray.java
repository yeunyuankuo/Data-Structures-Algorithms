package array;

public class OneDimensionalArray {
    int[] arr = null;
    // Constructor
    public OneDimensionalArray(int sizeOfArray) {
        this.arr = new int[sizeOfArray];
        for (int index = 0; index < sizeOfArray; index++) {
            arr[index] = Integer.MIN_VALUE;
        }
    }

    // Print the Array
    public void printArray() {
        try {
            for (int i : arr) System.out.print(i + " ");
            System.out.println();
        } catch (Exception e) {
            System.out.println("Array no longer exists.");
        }
    }

    // Insert value in the Array
    public void insertValueToArray(int location, int valueToBeInserted) {
        try {
            if (arr[location] != Integer.MIN_VALUE) {
                System.out.println("This cell is already occupied.");
            } else {
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted " + valueToBeInserted + " to index " + location);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index to Access Array.");
        }

    }

    // Access a particular element in an Array
    public void accessingCell(int cellNum) {
        try {
            System.out.println(arr[cellNum]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index to Access Array.");
        }
    }

    // Search for an element in the array
    public void searchingInArray(int valueToSearch) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == valueToSearch) {
                System.out.println("Found " + valueToSearch + " at index " + index);
                return;
            }
        }
        System.out.println("The value does not exist in the array.");
    }

    // Delete value from array
    public void deleteValueFromArray(int cellToBeEmptied) {
        try {
            arr[cellToBeEmptied] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This Index is invalid.");
        }
    }
}
