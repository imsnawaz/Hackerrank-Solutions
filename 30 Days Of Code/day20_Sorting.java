import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day20_Sorting {
    public static void swap(int[] a,int i,int j){
        a[i]=a[i]+a[j];
        a[j]=a[i]-a[j];
        a[i]=a[i]-a[j];
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int t=0;
        for(int i = 0;i<n;i++){
            int nswaps=0;
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
                    nswaps++;
                }
            }
            t+=nswaps;
            if(nswaps==0)
                break;
        }
        System.out.println("Array is sorted in "+t+" swaps.");
        System.out.println("First Element: "+a[0]+"\nLast Element: "+a[n-1]);
    }
}

