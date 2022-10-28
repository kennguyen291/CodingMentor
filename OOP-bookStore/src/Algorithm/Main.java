package Algorithm;

import java.util.Calendar;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int size = 10000;
        String[] arr = new String[size];
        for (int i = 0; i < arr.length; i++){
            arr[i] = "TEST";
        }
        arr[8500] = "RESULT";
        long startTime = Calendar.getInstance().getTimeInMillis();
        int index = findIndex(arr);
        long endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println(endTime - startTime);
        System.out.println("result index: " + index);
    }

    public static int findIndex(String[] arr){
        for (int i = 0; i < arr.length; i++){
            if (Objects.equals(arr[i], "RESULT")){
                return i;
            }
        }
       return 0;
    }
}
