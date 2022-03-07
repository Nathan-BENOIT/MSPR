import java.io.File;
import Generate.GenerateAccueil;
import Generate.GenerateFicheEmploye;
import java.awt.*;

public class Main {
    public static void main(String[] args) throws Exception {

        GenerateAccueil listeEmployes = new GenerateAccueil();
        for (int i = 0; i < listeEmployes.ListeEmployes().size(); i++) {
            GenerateFicheEmploye.generateHtmlFileEmploye(listeEmployes.ListeEmployes().get(i));
        }

        GenerateAccueil.generateHtmlFileAccueil();
        
        File htmlAccueilFile = new File("HTML/accueil.html");
        Desktop.getDesktop().browse(htmlAccueilFile.toURI());

        Parsing.getInfo();
        
        //System.out.println(Parsing.listeParsing());
        //System.out.println(Parsing.personalParsing());
    }
}