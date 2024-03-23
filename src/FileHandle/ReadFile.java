package FileHandle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
//import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.lang.module.FindException;
import java.util.Scanner;

public class ReadFile {
    int f;
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new FileReader("nithesh.txt"));

        String line;
       // System.out.println(f);

        while ( (line=reader.readLine())!=null){
            System.out.println(line);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("number enter");
        sc.nextInt();
        System.out.println(reader.readLine().charAt(0));
//
//

//        try{
//           int a=0;
//           throw new FindException();
//
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
    }
}
