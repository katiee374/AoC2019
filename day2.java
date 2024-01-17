import java.util.*;
import java.io.*;
public class day2 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("day2input.txt"));
        Intcode i = new Intcode(scan.next());
        i.run();
    }
}
