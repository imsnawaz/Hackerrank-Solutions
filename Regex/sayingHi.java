import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
public class sayingHi {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Pattern p = Pattern.compile("^[hH][Ii] {1}[^Dd]");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        for(int i =0;i<t;i++){
            String s = br.readLine();
            if(p.matcher(s).find())
                sb.append(s+"\n");
        }
        System.out.println(sb);
    }
}

