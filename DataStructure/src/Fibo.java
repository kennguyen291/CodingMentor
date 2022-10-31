import java.util.ArrayList;
import java.util.List;

public class Fibo {

    static int[] memo;
    public static void main(String[] args) {
        int n = 20;
        memo = new int[n + 1];
        System.out.print(fibonacciMemo(n));
    }

    public static int fibonacciMemo(int n){

        //memo[n] != 0 nghia la da dc tinh roi, cu su dung lai, ko can tinh nua
        if (memo[n] != 0) return memo[n];

        //base case
        if (n == 0 || n ==1){
            return n;
        }

        int answer = fibonacciMemo(n-1) + fibonacciMemo(n-2);
        //moi lan tinh dc so fibonacci nao thi luu lai vao memo de su dung vao nhung lan sau
        memo[n] = answer;
        return answer;
        //TIME COMPLEXITY O(n)
    }

    public static int fibonacciIteration(int number){
        int fibo0 = 0;
        int fibo1 = 1;

        int fiboN = 0;

        for (int i =0; i < number - 1; i++){
            fiboN = fibo0 + fibo1;
            fibo0 = fibo1;
            fibo1 = fiboN;
        };
        return fiboN;
    }


}
