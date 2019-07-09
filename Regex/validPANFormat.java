import java.io.*;
import java.util.*;
import java.util.regex.*;
public class validPANFormat {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pattern p = Pattern.compile("^[A-Z]{5}\\d{4}[A-Z]$");
        int t = Integer.parseInt(br.readLine());
        for(int i =0;i<t;i++){
            String pan = br.readLine().trim();
            System.out.print((p.matcher(pan).matches())? "YES\n":"NO\n");
        }
    }
}