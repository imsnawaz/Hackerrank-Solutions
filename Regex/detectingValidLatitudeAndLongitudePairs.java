import java.io.*;
import java.util.*;
import java.util.regex.*;
public class detectingValidLatitudeAndLongitudePairs {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pattern p = Pattern.compile("^\\([+-]?((\\d|[1-8]\\d)(\\.\\d+)?|90(\\.0+)?), [+-]?((\\d|1[0-7]\\d|[1-9]\\d)(\\.\\d+)?|180(\\.0+)?)\\)$");
        int t = Integer.parseInt(br.readLine());
        for(int i =0;i<t;i++){
            String s = br.readLine().trim();
            System.out.println((p.matcher(s).matches())? "Valid":"Invalid");
        }
    }
}