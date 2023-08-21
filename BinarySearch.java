public class BinarySearch {
    public static boolean binarySearch(int[]orderedArray, int targetValue) {
    int left = 0;
    int right = orderedArray.length-1;
    while (left<=right) {
        int mid = left + (right-left/2);
        if(orderedArray[mid] == targetValue) {
            return true;
        }
        else if(orderedArray[mid] < targetValue) {
            left = mid + 1;
        }
        else {
            right = mid - 1;
        }
    }
    return false;
    }
}