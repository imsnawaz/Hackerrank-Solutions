import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
public class hackerRankLanguage {
    public static void main(String[] args) throws IOException{
        Pattern p = Pattern.compile("^(P(YTHON|ERL|HP|ASCAL)|R(UBY)?|HASKELL|CLOJURE|SCALA|ERLANG|CLISP|LUA|B(RAINFUCK|ASH)|JAVA(SCRIPT)?|GO|OCAML|SBCL|D(ART)?|GROOVY|(OBJECTIVE)?C(PP|SHARP)?)$");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        for(int i =0;i<t;i++){
            String[] s = br.readLine().split(" ");
            String res = (p.matcher(s[1]).find())? "VALID\n":"INVALID\n";
            sb.append(res);
        }
        System.out.print(sb);
    }
}