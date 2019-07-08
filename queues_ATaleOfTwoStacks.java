import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class queues_ATaleOfTwoStacks {
    static class MyQueue<T>{
        static Stack<Integer> s1 = new Stack<Integer>();
        static Stack<Integer> s2 = new Stack<Integer>();
        static void enqueue(int data){
            s1.push(data);
        }
        static void dequeue(){
            if(s2.isEmpty()){
                while(!s1.isEmpty())
                    s2.push(s1.pop());
            }
            s2.pop();
        }
        static int peek(){
            if(s2.isEmpty()){
                while(!s1.isEmpty())
                    s2.push(s1.pop());
            }
            return s2.peek();
        }
    }
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}


