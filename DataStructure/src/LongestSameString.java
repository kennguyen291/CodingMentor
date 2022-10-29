public class LongestSameString {
    public static void main(String[] args) {
        String[] arr = {"cat", "cadai", "catch", "cadfad"};
//        String ans = findLongestPrefix(arr);
        String ans = findPrefix(arr);
        System.out.println(ans);



    }
//    public static String findLongestPrefix(String[] arr){
//
//        String shortestWord = arr[0]; // 1 step
//        for (int i = 1; i < arr.length; i++){ // n step
//            if (arr[i].length() < shortestWord.length()) {
//                shortestWord = arr[i];
//            };
//        }
//
//        String longestPrefix = ""; // 1 step
//        for (int i = 0; i < shortestWord.length(); i++){  // n * (n +2) = n^2 + 2n
//            //d
//            int match = 0; // 1 step
//            for(String word: arr){ // n
//                if (shortestWord.charAt(i) == word.charAt(i)){
//                    match ++;
//                } else return "empty";
//            }
//            if (match == arr.length){
//                longestPrefix += shortestWord.charAt(i); // 1 step
//            }
//        }
//
//        return longestPrefix; //1 step
//
//        //TIME COMPLEXITY  n^2 + 2n + n + 3 = n^2 + 3n +3 ==> O(n^2)
//    }

    public static String findPrefix(String[] arr){
        if (arr == null || arr.length == 0) return "";
        String prefix = arr[0];  //1 step
        int length = prefix.length(); //1 step
        for (int i = 1; i < arr.length; i++){ // n step
            while (arr[i].indexOf(prefix.substring(0, length)) != 0){ // step = length of first word
                length = length -1;
            }
        }
        return prefix.substring(0, length); //1 step

        // TIME COMPLEXITY n + 3 + length of first word(which is finite) ==> O(n)
    }
}
