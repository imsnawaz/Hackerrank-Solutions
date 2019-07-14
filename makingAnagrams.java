import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class makingAnagrams {
    static int anagram(String s) {
        if(s.length()%2==1)
            return -1;
        String s1 = s.substring(0,(s.length()/2));
        String s2 = s.substring((s.length()/2));
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(char c:s1.toCharArray())
            hm.put(c,(hm.containsKey(c))? hm.get(c)+1:1);
        for(char c:s2.toCharArray())
            hm.put(c,(hm.containsKey(c))? hm.get(c)+1:1);
        for(char c:s2.toCharArray())
            hm.put(c,(hm.containsKey(c))? hm.get(c)-2:1);
        int res=0;
        for(int x: hm.values())
            res+=Math.abs(x);
        hm.clear();
        return res/2;
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            int result = anagram(s);
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        scanner.close();
    }
}