import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class acmIcpcTeam {

    // Complete the acmTeam function below.
    static String acmTeam(String[] topic,int n, int m) {
        int max=0, mc=0,k;
        for(int i =1;i<n;i++){
            for(int j=i+1;j<=n;j++){
                int count=0;
                for(k=0;k<m;k++){
                    if(topic[i-1].charAt(k)=='1' || topic[j-1].charAt(k)=='1')
                        count++;
                }
                if(count>=max){
                    if(max==count)
                        mc++;
                    else{
                        max=count;
                        mc=1;
                    }
                }
            }
        }
        String s = Integer.valueOf(max)+"\n"+Integer.valueOf(mc);
        return s;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        String result = acmTeam(topic,n,m);
        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
