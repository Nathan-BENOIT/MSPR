/*
 EPSI PROJECT, 2021
 JAVA PARSING
 File description:
 parsing.java
*/

import java.io.File;
import java.util.Scanner;


public class Parsing2 {

    public static void StaffParsing() throws Exception {
        File doc = new File("/home/albano/Desktop/JAVA PARSING/staff.txt");
        try (Scanner obj = new Scanner(doc)) {
            //while (obj.hasNextLine())
                //System.out.println(obj.nextLine());
        }
    }

    public static String listeParsing() throws Exception {
        String info;
        File doc = new File("/home/albano/Desktop/JAVA PARSING/liste.txt");
        try (Scanner obj = new Scanner(doc)) {
            info = obj.nextLine() + "\n";
            while (obj.hasNextLine())
                info = info + obj.nextLine() + "\n";
        }
        //System.out.println(info);
        return info;
    }

    public static String personalParsing() throws Exception {
        // name = variable click 
        String info;
        File doc = new File("/home/albano/Desktop/JAVA PARSING/cberthier.txt");

        try (Scanner obj = new Scanner(doc)) {
            info = obj.nextLine() + "\n";
            while (obj.hasNextLine()) {
                info = info + obj.nextLine() + "\n"; 
            }
        }
        //System.out.println(info);

        return info;
    }

    public static void getInfo() throws Exception {
        String stuffListe = listeParsing();
        String stuffPers = personalParsing();
        String MidStuffPers;
        String wordToextract;


        for (int i = 0; i < stuffPers.length(); i++) {
            char a = stuffPers.charAt(i);
            if (a == '\n') {
                a = stuffPers.charAt(i - 1);
                if (a == '\n') {
                    MidStuffPers = stuffPers.substring(i);
                    for (int y = 0, x = 0 ; y < MidStuffPers.length(); y++) {
                        char b = MidStuffPers.charAt(y);
                        if (b == '\n') {
                            wordToextract = MidStuffPers.substring(x,y);
                            x = y;
                            if(stuffListe.contains(wordToextract)){ 
                                int z = stuffListe.indexOf(wordToextract); 
                                String u = stuffListe.substring(z , z+(wordToextract.length())); 
                                System.out.println(u); 
                                infoPrinter(u);
                            }
                        }
                    }
                }
            }
        }
    }

    public static String infoPrinter(String str) {
            if (str.equals("") )
                System.out.println("Kit oreillette");
        return str;

    }
    public static void main(String[] args) throws Exception {
        getInfo();
    }
}