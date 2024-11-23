import java.util.ArrayList;

/**
 * The SharedData class holds the shared data that is used by multiple threads.
 * It contains an ArrayList of integers, an array of booleans to store win conditions, 
 * a flag to indicate the result of an operation, and an integer value 'b'.
 * This class is designed to be accessed and modified by threads.
 */
public class SharedData {
    
    private ArrayList<Integer> array;
    private boolean[] winArray;
    private boolean flag;
    private final int b;
    
    /**
     * Constructs a SharedData object with the specified array and integer 'b'.
     * The array holds the data to be processed by the threads, and 'b' represents a specific value.
     *
     * @param array The ArrayList of integers that will be shared between threads.
     * @param b The integer value used by the threads for processing.
     */
    public SharedData(ArrayList<Integer> array, int b) {
        this.array = array;
        this.b = b;
    }

    /**
     * Returns the array of booleans that represent the win conditions for each element in the data array.
     * 
     * @return The winArray, a boolean array where each element represents a win condition.
     */
    public boolean[] getWinArray() {
        return winArray;
    }

    /**
     * Sets the array of booleans that represent the win conditions.
     *
     * @param winArray The boolean array to be set as the win conditions.
     */
    public void setWinArray(boolean[] winArray) {
        this.winArray = winArray;
    }

    /**
     * Returns the ArrayList of integers that represents the data being processed.
     *
     * @return The ArrayList of integers.
     */
    public ArrayList<Integer> getArray() {
        return array;
    }

    /**
     * Returns the value of 'b', which is used by the threads during processing.
     *
     * @return The integer value 'b'.
     */
    public int getB() {
        return b;
    }

    /**
     * Returns the flag indicating the success or failure of an operation.
     * The flag is typically used to represent the result of thread operations.
     *
     * @return The boolean flag indicating the result of an operation.
     */
    public boolean getFlag() {
        return flag;
    }

    /**
     * Sets the flag to the specified value, indicating the result of an operation.
     *
     * @param flag The boolean value to set as the result flag.
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
