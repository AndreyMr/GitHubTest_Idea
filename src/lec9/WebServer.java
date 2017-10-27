package lec9;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Logger;

public class WebServer {
   static int count;

   static final String root = "d:/JavaProject/Javatest";
   static String httpOk = "HTTP/1.1 200 OK\r\n";
   static String contentType = "Content-type: text/html; charset=utf-8\r\n";
   static String lenght = "Content-Length: ";
   public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(80);
        for(;;) {
            Socket socket = ss.accept();
            try {
                duGet(socket);
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.getClass().getName());

            }
        }

    }

    private static void duGet(Socket socket) throws IOException, FileNotFoundException {
        InputStream is = socket.getInputStream();
        Scanner scanner = new Scanner(is);
        String line = scanner.nextLine();
        String url = line.split("\\s+")[1];
        String path = root+url;
        for (; scanner.hasNextLine(); ) {
           line = scanner.nextLine();
            System.out.println(line);
            if (line.trim().isEmpty()) break;
        }

        OutputStream os = socket.getOutputStream();
        String content = "<HTML><body><H1>Hellow" +
                +count++ +
                "</HTML></body></H1>";
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        int fileSize = fis.available();
        byte[] bytes = new byte[fileSize];
        fis.read(bytes);
        os.write((httpOk + contentType + lenght + fileSize + "\r\n\r\n").getBytes());
        os.write(bytes);
        os.close();
        //System.out.println("Server shotdown");
    }
}
