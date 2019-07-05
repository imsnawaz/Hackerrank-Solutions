import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class ipAddressValidation {

    public static void main(String[] args) throws IOException{
        Pattern ip4 = Pattern.compile("^((2[0-4]\\d|25[0-5]|1\\d{2}|[1-9]\\d|\\d)\\.){3}(2[0-4]\\d|25[0-5]|1\\d{2}|[1-9]\\d|\\d)$");
        Pattern  ip6 = Pattern.compile("^([\\da-f]{1,4}:){7}[\\da-f]{1,4}$");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        for(int i =0;i<t;i++){
            String s = br.readLine();
            if(ip4.matcher(s).matches())
                sb.append("IPv4\n");
            else if(ip6.matcher(s).matches())
                sb.append("IPv6\n");
            else
                sb.append("Neither\n");
        }
        System.out.println(sb);
    }
}

