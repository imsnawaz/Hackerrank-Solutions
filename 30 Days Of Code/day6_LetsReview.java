import java.io.*;
import java.util.*;

public class day6_LetsReview {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            String s=sc.nextLine();
            String o="";
            String e="";
            for(int j=0;j<s.length();j++){
                if(j%2==0)
                    e+=s.charAt(j);
                else
                    o+=s.charAt(j);
            }
            System.out.println(e+" "+o);
        }
    }
}


