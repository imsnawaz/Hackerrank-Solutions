import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.lang.*;

public class hashTablesRansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] m, String[] n) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        int i;
        for (i = 0; i < m.length; i++) {
            if(hm.containsKey(m[i]))
                hm.put(m[i],hm.get(m[i])+1);
            else
                hm.put(m[i],1);
        }
        for (i = 0; i < n.length; i++) {
            if(hm.containsKey(n[i])){
                hm.put(n[i],hm.get(n[i])-1);
                if(hm.get(n[i])==0)
                    hm.remove(n[i]);
            }
            else{
                System.out.println("No");
                System.exit(0);
            }
        }
        if(i==n.length)
            System.out.println("Yes");

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
