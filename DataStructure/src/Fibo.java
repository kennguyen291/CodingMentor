public class Fibo {
    public static void main(String[] args) {
        System.out.println(fiboOf(45));
    }
    public static int fiboOf(int number){
        int fibo0 = 0;
        int fibo1 = 1;

        int fiboN = 0;

       for (int i =0; i < number - 1; i++){
           fiboN = fibo0 + fibo1;
           fibo0 = fibo1;
           fibo1 = fiboN;
       };

       return fiboN;
       // TIME COMPLEXITY O(n-1)
    }
}
