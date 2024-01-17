import java.util.*;
import java.io.*;
public class day1 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("day1input.txt"));
        int total = 0;
        while (scan.hasNext()) {
            int initialFuel=(scan.nextInt())/3-2;
            total+=fuel(initialFuel, 0);
        }
        System.out.println(total);
    }
    
    public static int fuel(int initialFuel, int sum) {
        if (initialFuel<=0) {
            return sum;
        } else {
            sum+=initialFuel;
            return fuel(initialFuel/3-2, sum);
        }
    }
}