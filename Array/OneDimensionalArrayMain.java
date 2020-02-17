package array;

public class OneDimensionalArrayMain {
    public static void main(String[] args) {
        // Create OneDimensionalArray
        OneDimensionalArray arr = new OneDimensionalArray(5);

        // Insert Values to Array
        arr.insertValueToArray(0, 1);
        arr.insertValueToArray(1, 2);
        arr.insertValueToArray(2, 3);
        arr.insertValueToArray(3, 4);
        arr.insertValueToArray(4, 5);
        arr.insertValueToArray(1, 10);      // insert to cell that is already occupied
        arr.insertValueToArray(100, 100);   // inserting to cell that doesn't exist

        arr.printArray();

        // Accessing Value in Cells
        arr.accessingCell(0);
        arr.accessingCell(4);
        arr.accessingCell(100);     // accessing cell that doesn't exist

        // Find a particular value in the Array
        arr.searchingInArray(1);
        arr.searchingInArray(100);

        // Delete or empty a certain cell
        arr.deleteValueFromArray(0);

        arr.printArray();
    }
}

