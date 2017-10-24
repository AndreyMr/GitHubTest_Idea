package lec6;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class FilesTest {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;


        //String nextLine = scanner.nextLine();
        //System.out.println(nextLine);
        File file = new File("D:/JavaProject/Javatest/1.txt");
        in = new FileInputStream(file);
        //Scanner scanner =  new Scanner(in);
        //in = new URL("http://specialist.ru").openStream();
        Scanner scanner = new Scanner(in);
        //String s = scanner.nextLine();
        //System.out.println(s);
        ArrayList<String> allWorlds = new ArrayList<>();
        HashMap<String, Integer> statMap = new HashMap<>();
        TreeMap<String, Integer> ststTreeMap = new TreeMap<>();


        for (; scanner.hasNextLine(); ) {
            String[] nextLine = scanner.nextLine().toLowerCase().split("[^а-яё]+");// авы 234 ыва
            for (int i = 0; i < nextLine.length; i++) {
                allWorlds.add(nextLine[i]);
            }
            //System.out.println(s);
            //System.out.println(nextLine[0]);
            //System.out.println(nextLine.length + "-------------------------");
        }
        System.out.println(allWorlds.size() + " размер общего массива слов");

        for (String world : allWorlds
                ) {
            int count = 0;
            for (String s : allWorlds
                    ) {
                if (world.equals(s)) count++;
            }
            //System.out.println(world + " добавляем слово");
            //System.out.println(count + " добавляем число повторений");
            statMap.put(world, count);
            ststTreeMap.put(world, count);
        }
        /*for (HashMap.Entry<String, Integer> print : statMap.entrySet()
                ) {
            if (print.getValue() > 1 && print.getValue() < 5)
                System.out.println("Слово \"" + print.getKey() + "\" встречается " + print.getValue() + " раза");
            else {
                System.out.println("Слово \"" + print.getKey() + "\" встречается " + print.getValue() + " раз");
            }
        }*/
        ststTreeMap.forEach((key, value) -> {
            if (value > 1 && value < 5)
                System.out.println("Слово \"" + key + "\" встречается " + value + " раза");
            else {
                System.out.println("Слово \"" + key + "\" встречается " + value + " раз");
            }
        });

    }
}
