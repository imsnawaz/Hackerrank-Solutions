import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class cutTheSticks {

    // Complete the cutTheSticks function below.
    static String cutTheSticks(int[] arr,int n) {
        Arrays.sort(arr);
        int val = arr[0];
        int j=0;
        String s = Integer.valueOf(n)+"\n";
        while(true){
            for(int i =j;i<n;i++)
                arr[i]-=val;
            while(j<n && arr[j]==0)
                j++;
            if(j==n)
                break;
            val = arr[j];
            s= s+Integer.valueOf(n-j)+"\n";
        }
        return s;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        String result = cutTheSticks(arr,n);

        bufferedWriter.write(result);

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
