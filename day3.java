import java.util.*;
import java.io.*;
public class day3 {
    private static int x1=0, y1=0, x2=0, y2=0;
    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(new File("day3input.txt"));
        String line1 = scan.next();
        String line2 = scan.next();
        String[] path1 = line1.split(",");
        String[] path2 = line2.split(",");
        char path1dir;
        char path2dir;
        for (int i=0; i<path1.length; i++) {
            path1dir = path1[i].charAt(0);
            path2dir = path2[i].charAt(0);
            if (path1dir == path2dir) {
                move(path1dir, path1[i]);
                move(path2dir, path2[i]);
            } else if (x1<x2) {
                move(path1dir, path1[i]);
                move(path2dir, path2[i]);
                if (x1>=x2) {
                    
                }
            }
        }
    }

    public static void move(char dir, String length) {
        switch(dir) {
            case 'U':
                y1+=Integer.parseInt(length);
                break;
            case 'D':
                y1-=Integer.parseInt(length);
                break;
            case 'R':
                x1+=Integer.parseInt(length);
                break;
            case 'L':
                x1-=Integer.parseInt(length);
                break;
        }
    }
}
