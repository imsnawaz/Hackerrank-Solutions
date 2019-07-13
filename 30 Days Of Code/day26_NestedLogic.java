import java.io.*;
import java.util.*;
public class day26_NestedLogic {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().trim().split("\\s+");
        String[] e = br.readLine().trim().split("\\s+");
        int ad = Integer.parseInt(a[0]);
        int am = Integer.parseInt(a[1]);
        int ay = Integer.parseInt(a[2]);
        int ed = Integer.parseInt(e[0]);
        int em = Integer.parseInt(e[1]);
        int ey = Integer.parseInt(e[2]);
        int fine=0;
        if(ey>ay)
            fine=0;
        else if(ey==ay){
            if(em>am)
                fine = 0;
            else if(em==am){
                fine = (ed>=ad)? 0:(ad-ed)*15;
            }
            else
                fine = (am-em)*500;
        }
        else
            fine=10000;
        System.out.println(fine);
    }
}