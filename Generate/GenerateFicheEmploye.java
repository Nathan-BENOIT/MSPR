package Generate;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateFicheEmploye {

    public static void generateHtmlFileEmploye(String nom) throws IOException {
        String filePath = String.format("HTML/fiche_employe_%s.html", nom);

        File htmlSortant = new File(filePath);

        htmlSortant.getParentFile().mkdirs();

        FileWriter htmlWriter = new FileWriter(htmlSortant);

        System.out.println("Fichier écrit : " + htmlSortant.getAbsolutePath());

        htmlWriter.write("<html>");
        htmlWriter.write("\n");
        htmlWriter.write("<head>");
        htmlWriter.write("\n");
        htmlWriter.write("<title>Go Secury | Accueil gestion des agents");
        htmlWriter.write("</title>");
        htmlWriter.write("\n");
        htmlWriter.write("<link rel='icon' href='../assets/icon.png' type='image/x-icon'>");
        htmlWriter.write("\n");
        htmlWriter.write("<link href='../CSS/style.css' rel='stylesheet'>");
        htmlWriter.write("\n");
        htmlWriter.write("<link rel='preconnect' href='https://fonts.googleapis.com'>");
        htmlWriter.write("\n");
        htmlWriter.write("<link rel='preconnect' href='https://fonts.gstatic.com' crossorigin>");
        htmlWriter.write("\n");
        htmlWriter.write("<link href='https://fonts.googleapis.com/css2?family=Roboto:wght@300&display=swap' rel='stylesheet'>");
        htmlWriter.write("\n");
        htmlWriter.write("</head>");
        htmlWriter.write("\n");
        htmlWriter.write("<body>");
        htmlWriter.write("\n");
        htmlWriter.write("<ul>");
        htmlWriter.write("\n");
        htmlWriter.write("<li><img src='../assets/logo.png' alt='Logo'></li>");
        htmlWriter.write("\n");
        htmlWriter.write("<li><a href='accueil.html' class='accueil'>Accueil</a></li>");
        htmlWriter.write("\n");
        htmlWriter.write("</ul>");
        htmlWriter.write("\n");
        htmlWriter.write("<div class='Entete'>");
        htmlWriter.write("\n");
        htmlWriter.write("<img src='../assets/logo.png' alt='Logo'>");
        htmlWriter.write("\n");
        htmlWriter.write("<h1>Fiche employé");
        htmlWriter.write("</h1>");
        htmlWriter.write("\n");
        htmlWriter.write("<h3>Prénom");
        htmlWriter.write("</h3>");
        htmlWriter.write("\n");
        htmlWriter.write("</div>");
        htmlWriter.write("\n");
        htmlWriter.write("<div class='listeEmployes'>");
        htmlWriter.write("\n");
        htmlWriter.write("</div>");
        htmlWriter.write("\n");
        htmlWriter.write("</body>");
        htmlWriter.write("\n");
        htmlWriter.write("</html>");

        htmlWriter.close();
    }
}