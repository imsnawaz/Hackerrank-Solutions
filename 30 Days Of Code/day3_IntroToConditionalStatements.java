import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class day3_IntroToConditionalStatements {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int rem = n%2;
        if(rem==1)
            System.out.println("Weird");
        else if(rem==0 && n<=20){
            if(n>=6)
                System.out.println("Weird");
            else if(n>=2)
                    System.out.println("Not Weird");
        }
        else
            System.out.println("Not Weird");
        scanner.close();
    }
}

