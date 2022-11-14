import com.sun.management.UnixOperatingSystemMXBean;

public class TheFeast {
    public static void main(String[] args) {
        int ans = calcChocolate(10,2,2);
        System.out.println(ans);

    }

    public static int calcChocolate(int money, int cost, int wrapper){
        int numberOfChoco = money / cost;
        int totalWrapper = numberOfChoco;

        while (totalWrapper >= wrapper){
            numberOfChoco ++;
            totalWrapper = totalWrapper - wrapper + 1;
        }

        return numberOfChoco;
    }
}
