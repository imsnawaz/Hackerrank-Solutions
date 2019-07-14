import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class day28_RegexPatternsIntroToDatabases {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        Pattern p = Pattern.compile("^[a-z\\.]+@gmail.com$");
        String[] names = new String[N];
        int k=0;
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            if(p.matcher(emailID).matches())
                names[k++]=firstName;
        }
        for(int i=0;i<k-1;i++){
            for(int j =i+1;j<k;j++){
                if(names[i].compareTo(names[j])>0){
                    String temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;
                }
            }
        }
        for(int i =0;i<k;i++)
            System.out.println(names[i]);
        scanner.close();
    }
}