package array;

public class TwoDimensionalArrayMain {
    public static void main(String[] args) {
        // Create TwoDimensionalArray
        TwoDimensionalArray arr = new TwoDimensionalArray(3, 3);
        // Insert value into Array creating a 3 x 3 Array
        arr.insertValueToArray(0, 0, 1);
        arr.insertValueToArray(0, 1, 2);
        arr.insertValueToArray(0, 2, 3);
        arr.insertValueToArray(1, 0, 4);
        arr.insertValueToArray(1, 1, 5);
        arr.insertValueToArray(1, 2, 6);
        arr.insertValueToArray(2, 0, 7);
        arr.insertValueToArray(2, 1, 8);
        arr.insertValueToArray(2, 2, 9);
        arr.insertValueToArray(2, 2, 100);
        // Print the array
        arr.printArray();
        // Print certain cells
        arr.accessingCellInArray(0, 0);
        arr.accessingCellInArray(10,10);
        // Search for values inside array
        arr.searchingValueFromArray(5);
        arr.searchingValueFromArray(1);
        arr.searchingValueFromArray(100);
        // Delete/Empty a certain cell's value
        arr.deletingValueFromArray(2,2);
        arr.deletingValueFromArray(10, 10);
        arr.printArray();
    }
}

