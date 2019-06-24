import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class appleAndOrange {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(long s, long t, long a, long b, long[] apples, long[] oranges) {
        long ca=0,co=0;
        for(long i:apples)
            if((a+i)>=s && (a+i)<=t)
                ca++;
        for(long i:oranges)
            if((b+i)<=t && (b+i)>=s)
                co++;
        System.out.println(ca+"\n"+co);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        long s = Long.parseLong(st[0]);

        long t = Long.parseLong(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        long a = Long.parseLong(ab[0]);

        long b = Long.parseLong(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        long[] apples = new long[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            long applesItem = Long.parseLong(applesItems[i]);
            apples[i] = applesItem;
        }

        long[] oranges = new long[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            long orangesItem = Long.parseLong(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}

