package array;

public class TwoDimensionalArray {
    int arr[][] = null;

    // Constructor
    public TwoDimensionalArray(int rowSize, int colSize) {
        this.arr = new int[rowSize][colSize];
        for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < colSize; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // Print the Array
    public void printArray() {
        try {
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    System.out.print(arr[row][col] + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists.");
        }
    }

    // Insert Value in the Array
    public void insertValueToArray(int row, int col, int valueToInsert) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = valueToInsert;
                System.out.println("Successfully added " + valueToInsert + " to row " + row + " col " + col);
            } else {
                System.out.println("This cell is already occupied.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid cell detected.");
        }
    }

    // Accessing single cell from the array
    public void accessingCellInArray(int row, int col) {
        try {
            System.out.println("Accessed: " + arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid cell detected.");
        }
    }

    // searching a single value from the array
    public void searchingValueFromArray(int valueToFind) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == valueToFind) {
                    System.out.println("Found the value at row " + row + " col " + col);
                    return;
                }
            }
        }
        System.out.println("The value doesn't exist within the array.");
    }

    // deleting a cell's value from the array
    public void deletingValueFromArray(int row, int col) {
        try {
            arr[row][col] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid cell detected.");
        }
    }
}

