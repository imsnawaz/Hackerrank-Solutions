//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class day8_DictionariesAndMaps{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Long> hm = new HashMap<String, Long>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            long phone = in.nextLong();
            // Write code here
            hm.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(hm.containsKey(s))
                System.out.println(s+"="+hm.get(s));
            else
                System.out.println("Not found");
        }
        in.close();
    }
}


