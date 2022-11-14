public class findSquareInteger {
    public static void main(String[] args) {
        int ans = findSquareInt(100,10000);
        System.out.println(ans);
    }

    public static int findSquareInt (int start, int end){
        int time = 0;
        int count = 0;
        int sqrtOfStart = (int) Math.sqrt(start);
        int sqrtOfEnd = (int) Math.sqrt(end);
        for (int i = sqrtOfStart; i <= sqrtOfEnd; i++){
            time++;

            if ((i * i) >= start && (i * i) <= end){
                count ++;
            }
        }
        System.out.println("Time: "+ time);
        return count;

    }
}
