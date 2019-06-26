import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.lang.*;

public class cavityMap {

    // Complete the cavityMap function below.
    static boolean checkMe(String[] grid, char ele,int i,int j){
        if(grid[i].charAt(j-1)<ele && grid[i].charAt(j+1)<ele && grid[i-1].charAt(j)<ele && grid[i+1].charAt(j)<ele)
            return true;
        else
            return false;
    }
    static String[] cavityMap(String[] grid, int n) {
        for(int i=1;i<n-1;i++){
            StringBuffer temp=new StringBuffer(grid[i]);
            for(int j=1;j<n-1;j++){
                if(checkMe(grid,temp.charAt(j),i,j))
                    temp.setCharAt(j,'X');
            }
            grid[i]=temp.toString();
        }
        return grid;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = cavityMap(grid,n);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
