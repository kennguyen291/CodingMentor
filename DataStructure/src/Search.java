public class Search {
    public static void main(String[] args) {
        int[] arr = {1,3,4,9,18,65};
        System.out.println(searchIndexOf(65, arr));
    }

    public static int searchIndexOf(int number, int[] arr){
        int left = 1;
        int right = arr.length;

        while (left <= right){
            int mid = (left + right) / 2;
            if ( number < arr[mid]){
                right = mid -1;
            } else if (number > arr[mid]){
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
