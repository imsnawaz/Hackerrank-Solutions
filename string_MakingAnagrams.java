import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class string_MakingAnagrams {
    static int makeAnagram(String a, String b) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(char c:a.toCharArray())
            hm.put(c,(hm.containsKey(c))? (hm.get(c)+1):1);
        for(char c:b.toCharArray())
            hm.put(c,(hm.containsKey(c))? (hm.get(c)+1):1);
        for(char c:a.toCharArray())
            hm.put(c,(hm.containsKey(c))? (hm.get(c)-2):1);
        int sum=0;
        for(int x:hm.values())
            sum+=Math.abs(x);
        return sum;
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int res = makeAnagram(a, b);
        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}

