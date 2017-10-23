package lec6;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class FilesTest {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;


        //String nextLine = scanner.nextLine();
        //System.out.println(nextLine);
        File file = new File("D:/JavaProject/Javatest/1.txt");
        in = new FileInputStream(file);
        //Scanner scanner =  new Scanner(in);

        in = new URL("http://specialist.ru").openStream();
        Scanner scanner =  new Scanner(in);


       for (;scanner.hasNextLine();) {
         String s = scanner.nextLine();
            System.out.println(s);

        }
    }
}
