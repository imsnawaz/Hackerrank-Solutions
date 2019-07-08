import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class sorting_BubbleSort {
    static void swap(int[] a,int i,int j){
        a[i]=a[i]+a[j];
        a[j]=a[i]-a[j];
        a[i]=a[i]-a[j];
    }
    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int c=0;
        for(int i =0;i<a.length;i++){
            int s=0;
            for(int j = 0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
                    s++;
                }
            }
            if(s==0)
                break;
            c+=s;
        }
        System.out.println("Array is sorted in "+c+" swaps.");
        System.out.println("First Element: "+a[0]+"\nLast Element: "+a[a.length-1]);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}

