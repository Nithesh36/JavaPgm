package javaRevise_coding;

import java.io.*;

public class LambdaEx
{

    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("reviseFile.txt",true));
        bw.write("nitheesh");
        bw.newLine();
        bw.write("welcome");
        bw.close();
        BufferedReader br=new BufferedReader(new FileReader("reviseFile.txt"));
        String line="";
        while ((line=br.readLine())!=null)
            System.out.println(line);


    }
}
