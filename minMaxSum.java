import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class miniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr, long sum) {
        Arrays.sort(arr);
        System.out.print((sum-(long)arr[arr.length-1])+" "+(sum-(long)arr[0]));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        long sum=0;

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
            sum+=(long)arr[i];
        }

        miniMaxSum(arr,sum);

        scanner.close();
    }
}

