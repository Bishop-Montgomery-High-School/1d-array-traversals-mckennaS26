public class MinMax {

    /**
     * Returns the smallest value in the array.
     *
     * Traversal strategy: initialize your tracking variable to arr[0],
     * then loop from index 1 to the end, updating whenever you find
     * a smaller value.
     *
     * Assume the array is non-null and has at least one element.
     *
     * Example:
     *   arr = {5, 3, 8, 1, 6}  →  returns 1
     *   arr = {4, 4, 4}        →  returns 4
     */
    public int min(int[] arr) {
        // TODO: initialize a tracking variable to arr[0]

        int min = arr[0];
        // TODO: loop from index 1 to arr.length - 1
        //       if arr[i] is less than your tracking variable, update it
        for(int i = 1; i <= arr.length - 1; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        // TODO: return the tracking variable
        return min; // placeholder
    }

    /**
     * Returns the largest value in the array.
     *
     * Traversal strategy: same pattern as min(), but update when you
     * find a larger value instead.
     *
     * Assume the array is non-null and has at least one element.
     *
     * Example:
     *   arr = {5, 3, 8, 1, 6}  →  returns 8
     *   arr = {-2, -5, -1}     →  returns -1
     */
    public int max(int[] arr) {
        // TODO: initialize a tracking variable to arr[0]
        int max = arr[0];
        // TODO: loop from index 1 to arr.length - 1
        //       if arr[i] is greater than your tracking variable, update it
        for(int i = 1; i <= arr.length - 1; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        // TODO: return the tracking variable
        return max; // placeholder
    }
}