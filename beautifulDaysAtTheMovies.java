import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class beautifulDaysAtTheMovies {
    static int reverse(int n){
        int res=0;
        while(n>0){
            int rem=n%10;
            res=(res*10)+rem;
            n/=10;
        }
        return res;
    }
    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int count=0;
        for(int x = i;x<=j;x++){
            if(((Math.abs(x-reverse(x))/(float)k)-((int)Math.abs(x-reverse(x))/k))==0)
                count++;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

