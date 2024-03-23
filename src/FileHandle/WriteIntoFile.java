package FileHandle;

import java.io.*;

public class WriteIntoFile {
    public static void main(String[] args) throws IOException {
        boolean append = true;
        String filename = "nithesh.txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter(filename, append));
// OR: BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename, append)));
//        writer.write("nithesEswaran");
//        writer.newLine();
//        writer.write("kumar");
        writer.newLine();
        writer.write(String.valueOf(988));
        writer.newLine();
// ......

        writer.close();
        String line;
        BufferedReader Reader=new BufferedReader(new FileReader("nithesh.txt"));
        while( ((line=Reader.readLine()) !=null)){
            System.out.println(line);
        }
    }
}
