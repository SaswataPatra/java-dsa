package Normal;
import java.io.*;
import java.util.Scanner;
public class fileHandling {
    public static void main(String[]args)throws IOException{ 
        File fs = new File("/Users/saswatapatra/Java/Normal/myfile.txt");

        // fs.createNewFile(); //used to create file


        //used to read the file
        // Scanner sc = new Scanner(fs);
        // while(sc.hasNextLine()){
        //     String data = sc.nextLine();
        //     System.out.println(data);
        // }
        // sc.close();

        //writing in a file
        // FileWriter fw = new FileWriter("/Users/saswatapatra/Java/Normal/myfile.txt");
        // fw.write("Kalo world");
        // fw.close();


        //Appending content
        FileWriter fw = new FileWriter("/Users/saswatapatra/Java/Normal/myfile.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter out = new PrintWriter(bw);
        out.println("Kalo");
        out.close();
    }
}
