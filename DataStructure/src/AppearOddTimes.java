import java.util.HashMap;
import java.util.Map;

public class AppearOddTimes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,1,2,3,4,5,100,400, 15,15,15,15,15,15,15,15};
        findOddTimesNumber(arr);

    }
    public static void findOddTimesNumber(int[] arr){
        Map<Integer, Integer> numberOccurrence = new HashMap<>();
        for (int num: arr){
            if (numberOccurrence.containsKey(num)){
                numberOccurrence.put(num, numberOccurrence.get(num) + 1);
            } else {
                numberOccurrence.put(num, 1);
            }
        }
        System.out.println(numberOccurrence);

        for (int i: numberOccurrence.keySet()){
            if (numberOccurrence.get(i) % 2 != 0){
                System.out.println(i + " appears " + numberOccurrence.get(i) + " times.");
            }
        }
    }


}
