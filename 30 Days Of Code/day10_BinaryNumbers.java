import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class day10_BinaryNumbers {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        char c[] = Integer.toBinaryString(n).toCharArray();
        int mm=0;
        for(int i=0;i<c.length;i++){
            int max=0;
            for(int j=i;j<c.length;j++){
                if(c[j]=='1')
                    max++;
                else
                    break;
            }
            if(max>mm)
                mm=max;
        }
        System.out.println(mm);
        scanner.close();
    }
}

