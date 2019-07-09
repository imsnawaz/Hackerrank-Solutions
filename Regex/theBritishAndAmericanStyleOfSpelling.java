import java.io.*;
import java.util.*;
import java.util.regex.*;
public class theBritishAndAmericanStyleOfSpelling {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] lines = new String[n];
        for(int i =0;i<n;i++)
            lines[i]=br.readLine();
        int t = Integer.parseInt(br.readLine());
        for(int i =0;i<t;i++){
            String word = br.readLine().trim();
            String pat = "\\b"+word.substring(0,word.length()-2)+"[zs]e\\b";
            Pattern p = Pattern.compile(pat);
            int count=0;
            for(int j =0;j<n;j++){
                Matcher matcher = p.matcher(lines[j]);
                while(matcher.find())
                    count++;
            }
            System.out.println(count);
        }
    }
}

