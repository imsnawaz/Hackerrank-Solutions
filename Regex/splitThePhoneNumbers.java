import java.io.*;
import java.util.*;
public class splitThePhoneNumbers {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i =0;i<t;i++){
            String[] nums = br.readLine().trim().split("[ -]");
            System.out.println("CountryCode="+nums[0]+",LocalAreaCode="+nums[1]+",Number="+nums[2]);
        }
    }
}