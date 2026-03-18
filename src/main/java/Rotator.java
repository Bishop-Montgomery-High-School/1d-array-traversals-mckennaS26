public class Rotator {

    /**
     * Rotates all elements one position to the LEFT.
     * The element at index 0 wraps around to the last position.
     * The original array is modified in place; nothing is returned.
     *
     * Traversal strategy:
     *   1. Save arr[0] in a temporary variable BEFORE the loop.
     *   2. Loop from index 0 to arr.length - 2, copying arr[i + 1] into arr[i].
     *   3. After the loop, place the saved value at arr[arr.length - 1].
     *
     * Assume the array is non-null and has at least one element.
     *
     * Example (before → after):
     *   {10, 20, 30, 40, 50}  →  {20, 30, 40, 50, 10}
     *   {7}                   →  {7}
     */
    public void rotateLeft(int[] arr) {
        // TODO: save arr[0] into a temporary variable
        int value = arr[0];
        // TODO: loop from i = 0 to arr.length - 2
        //       assign arr[i + 1] to arr[i]
        for(int i = 0; i <= arr.length - 2; i++) {
            arr[i] = arr[i + 1];
        }
        // TODO: place the saved value at arr[arr.length - 1]
        arr[arr.length - 1] = value;
    }

    /**
     * Rotates all elements one position to the RIGHT.
     * The element at index arr.length - 1 wraps around to the first position.
     * The original array is modified in place; nothing is returned.
     *
     * Traversal strategy:
     *   1. Save arr[arr.length - 1] in a temporary variable BEFORE the loop.
     *   2. Loop from index arr.length - 1 DOWN to index 1,
     *      copying arr[i - 1] into arr[i].
     *   3. After the loop, place the saved value at arr[0].
     *
     * IMPORTANT: the loop must run in reverse to avoid overwriting
     * values before they have been moved.
     *
     * Assume the array is non-null and has at least one element.
     *
     * Example (before → after):
     *   {10, 20, 30, 40, 50}  →  {50, 10, 20, 30, 40}
     *   {7}                   →  {7}
     */
    public void rotateRight(int[] arr) {
        // TODO: save arr[arr.length - 1] into a temporary variable
        int temp = arr[arr.length - 1];
        // TODO: loop from i = arr.length - 1 DOWN to i = 1
        //       assign arr[i - 1] to arr[i]
        for(int i = arr.length - 1; i >= 1; i--) {
            arr[i] = arr[i -1];
        }
        // TODO: place the saved value at arr[0]
        arr[0] = temp;
    }
}