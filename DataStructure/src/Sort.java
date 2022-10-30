import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {2,2,2,1,1,1,1,0,0,0,0,0};
        int[] sortedArr = arrSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] arrSort(int[] arr){
        int[] count = {0,0,0}; // 1 step
        for (int number: arr){ // n step
            switch (number){
                case 0:
                    count[0]++;
                    break;
                case 1:
                    count[1]++;
                    break;
                case 2:
                    count[2]++;
                    break;
            }
        }
        int[] sortedArr = new int[arr.length]; //1 step
        for (int i = 0; i < sortedArr.length; i++){ // n step
            if (i < count[0]){
                sortedArr[i] = 0;
            } else if (i < count[0] + count[1]){
                sortedArr[i] = 1;
            } else {
                sortedArr[i] = 2;
            }
        }
        return sortedArr; // 1 step

        // TIME COMPLEXITY O(n)
    }

//    public static int[] sort(int[] arr){
//        int index = 0;
////        int i = 0;
////        int j = nums.length - 1;
//
//        for (int i = 0; i < arr.length; i++){
//
//            if (arr[i] == 0 || arr[i] == 2){
//
//            }
//        }


//    }
}
