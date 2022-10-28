public class SQRT {
    public static void main(String[] args) {
        System.out.println(findSqrt(6159));
    }

    public static double findSqrt(int number){
        if (number == 0) return 0;
        double left = 1;
        double right = number;
        double ans = 0;
        while (left < right){
            double mid = left + (right - left)/2;
            System.out.println(mid);
            if (mid == number / mid ){
                ans = mid;
            } else if (mid < number / mid){
                left = mid + 0.01;
            } else if (mid > number / mid){
                right = mid -0.01;
            }
        }
        return Math.round((left - 0.01) * 100.0) / 100.0;

        //TIME COMPLEXITY O(log n)
    }
}
