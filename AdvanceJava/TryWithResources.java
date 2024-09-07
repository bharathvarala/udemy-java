package AdvanceJava;
import java.io.*;

public class TryWithResources {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Instead of finally block we can just declare the BufferedReader object in try itself so that the resource will get closed automatically.
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        
        // finally
        // {
        //     br.close();
        // }
        




    }
}
