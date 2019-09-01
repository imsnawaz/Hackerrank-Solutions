import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class dayOfProgrammer {

    // Complete the dayOfProgrammer function below.
    static boolean isLeap(int year){
        if(year<1918)
            if(year%4==0)
                return true;
        if((year%4==0&&year%100!=0)||year%400==0)
            return true;
        return false;
    }
    static String dayOfProgrammer(int year) {
        return (isLeap(year))?"12.09."+year:(year==1918)?"26.09.1918":"13.09."+year;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
