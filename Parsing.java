//import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class Parsing
{

    public static class globals {
        public static String staffList;
        public static String agentSheet;
    }

    public static void StaffParsing() throws Exception {
        URL url = new URL("https://raw.githubusercontent.com/Nathan-BENOIT/MSPR/main/staff.txt");
        BufferedReader read = new BufferedReader(
            new InputStreamReader(url.openStream())
        );
        try (Scanner obj = new Scanner(read)) {
            //while (obj.hasNextLine())
                //System.out.println(obj.nextLine());
        }
    }

    public static String listeParsing() throws Exception {
        String info;
        URL url = new URL("https://raw.githubusercontent.com/Nathan-BENOIT/MSPR/main/liste.txt");
        BufferedReader read = new BufferedReader(
            new InputStreamReader(url.openStream())
        );
        try (Scanner obj = new Scanner(read)) {
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
        //boolean check;
        URL url = new URL("https://raw.githubusercontent.com/Nathan-BENOIT/MSPR/main/cberthier.txt");
        BufferedReader read = new BufferedReader(
            new InputStreamReader(url.openStream())
        );

        try (Scanner obj = new Scanner(read)) {
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
}

