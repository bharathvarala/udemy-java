package AdvanceJava;
import java.util.*;
import java.io.*;


public class BufferReaderAndScanner {
    public static void main(String[] args) throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int n1 = Integer.parseInt(bf.readLine());
        System.out.println(n1);
        bf.close();

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(s +" "+ n);
    
    
    }    
}
