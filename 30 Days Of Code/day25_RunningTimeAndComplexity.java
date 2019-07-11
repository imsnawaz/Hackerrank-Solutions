import java.io.*;
import java.util.*;
public class day25_RunningTimeAndComplexity {
    public static boolean isPrime(long n){
        if(n==1)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)
                return false;
        return true;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        for(int i =0;i<t;i++){
            long n = Long.parseLong(br.readLine());
            sb.append(isPrime(n)? "Prime\n": "Not prime\n");
        }
        System.out.println(sb);
    }
}