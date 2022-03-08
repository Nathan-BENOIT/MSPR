//import java.io.*;
package Parsing;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Parsing
{

    public static class globals {
        public static String staffList;
        public static String agentSheet;
    }

    public static ArrayList<String> listEmployes = new ArrayList<String>();

    public static ArrayList<String> StaffParsing() throws Exception {
        URL url = new URL("https://raw.githubusercontent.com/Nathan-BENOIT/MSPR/main/staff.txt");
        BufferedReader read = new BufferedReader(
            new InputStreamReader(url.openStream()));

        String line;
        listEmployes.clear();
        while ((line = read.readLine()) != null){
            listEmployes.add(line);
        }
        read.close();
        return listEmployes;
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
        read.close();
        return info;
    }

    public static ArrayList<String> personalParsing(String nom) throws Exception {
        ArrayList<String> listAgent = new ArrayList<String>();
        //String info;
        URL url = new URL("https://raw.githubusercontent.com/Nathan-BENOIT/MSPR/main/staff/" + nom  + "/" + nom + ".txt");
        BufferedReader read = new BufferedReader(
            new InputStreamReader(url.openStream())
        );

        /*try (Scanner obj = new Scanner(read)) {
            info = obj.nextLine() + "\n";
            while (obj.hasNextLine()) {
                info = info + obj.nextLine() + "\n";
            }
        }*/

        String line;
        listAgent.clear();
        while ((line = read.readLine()) != null){
            listAgent.add(line);
        }

        read.close();
        return listAgent;
        //return info;
    }

    public static ArrayList<String> listMatos = new ArrayList<String>();

    /*public static ArrayList<String> matosParsing(String nom) throws Exception {
        ArrayList<String> listAgent = personalParsing(nom);

        for(int i=0; i < listAgent.size(); i++){
            for(int j=0; j < listAgent.get(i).length(); j++){
                char a = listAgent.get(i).charAt(j);
                if(Character.isUpperCase(a)){
                    String line;
                    listMatos.clear();
                    while ((line = listAgent.get(i)) != null){
                        listMatos.add(line);
                    }
                    return listMatos;
                }
            }
        }
        return null;
    }

    /*public static ArrayList<String> getInfo(String nom) throws Exception {
        String stuffListe = listeParsing();
        String stuffPers = materielParsing(nom);
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
                                return listMatos;
                            }
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }*/
}

