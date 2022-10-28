public class LongestSameString {
    public static void main(String[] args) {
        String[] arr = {"cat", "category", "catch"};
        String ans = findLongestPrefix(arr);
        System.out.println(ans);

    }

    public static String findLongestPrefix(String[] arr){

        String shortestWord = arr[0]; // 1 step
        for (int i = 1; i < arr.length; i++){ // n step
            if (arr[i].length() < shortestWord.length()) {
                shortestWord = arr[i];
            };
        }

        String longestPrefix = ""; // 1 step
        for (int i = 0; i < shortestWord.length(); i++){  // n * (n +2) = n^2 + 2n
            //d
            int match = 0; // 1 step
            for(String word: arr){ // n
                if (shortestWord.charAt(i) == word.charAt(i)){
                    match ++;
                } else return "empty";
            }
            if (match == arr.length){
                longestPrefix += shortestWord.charAt(i); // 1 step
            }
        }

        return longestPrefix; //1 step

        //TIME COMPLEXITY  n^2 + 2n + n + 3 = n^2 + 3n +3 ==> O(n^2)
    }
}
