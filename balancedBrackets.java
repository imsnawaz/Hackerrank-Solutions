import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class balancedBrackets {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        Stack<Character> st = new Stack<Character>();
        int flag = 0;
        char val='.';
        for(char c: s.toCharArray()){
            if(c=='{' || c=='(' || c=='[')
                st.push(c);
            else{
                if(st.isEmpty()){
                    flag=1;
                    break;
                }
                switch(st.pop()){
                    case '(': val = ')';
                                break;
                    case '{': val='}';
                                break;
                    case '[': val=']';
                }
                if(val!=c){
                    flag=1;
                    break;
                }
            }
        }
        String res = (flag==1 || !st.isEmpty())? "NO":"YES";
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

