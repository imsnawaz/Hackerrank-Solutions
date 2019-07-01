import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class day2_Operators {

    // Complete the solve function below.
    static int round(double x){
        if(x-(int)x>=0.5)
            return (int)x+1;
        else
            return (int)x; 
    }
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double val=meal_cost+(meal_cost*((double)tip_percent+(double)tax_percent)/100.0);
        System.out.println(round(val));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}

