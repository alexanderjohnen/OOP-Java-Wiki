package paradigms;

import javax.swing.*;
import static shared.ReadFiles.FALLBACK_ERROR_MESSAGE;
import static shared.ReadFiles.readPath;

public class Main
{
    static void main()
    {
        String fallback = "Programmier-Paradigma = Grundlegender Denkstil, nach dem ein Programm aufgebaut wird. Eine Sprache kann mehrere Paradigmen unterstützen (Java z.B. prozedural und objektorientiert).\n" +
                "\n" +
                "Imperativ = Der Code beschreibt Schritt für Schritt, was der Computer in welcher Reihenfolge tun soll (wie ein Kochrezept).\n" +
                "\n" +
                "Prozedural = Imperativ, aber der Code ist in wiederverwendbare Prozeduren (Methoden) aufgeteilt. Daten und Methoden sind getrennt: Die Methode bekommt Daten übergeben und gibt ein Ergebnis zurück.\n" +
                "\n" +
                "Objektorientiert (OOP) = Daten und die dazugehörigen Methoden werden in Objekten gebündelt. Man denkt in \"Dingen\" mit Eigenschaften (Felder) und Verhalten (Methoden).\n" +
                "\n" +
                "Unterschied: Prozedural fragt \"Welche Schritte brauche ich?\". OOP fragt \"Welche Dinge gibt es, und was können sie?";
        String path1 = "C:\\Users\\Alexander\\Dokumente\\OOPJavaWiki\\Files\\PLACEHOLDER";
        String path2 = "C:\\Users\\ajohnen\\82.FIAEQ1_Projekte\\OOP-Java-Wiki\\OOP-Java-Wiki-Dateien\\PLACEHOLDER";
        String[] pathArray = {path1, path2};
        String paradigms = readPath(pathArray, fallback);
        boolean fallbackUsed = paradigms.equals(fallback);

        SwingUtilities.invokeLater(() -> new WikiParadigmsGui().show(paradigms, FALLBACK_ERROR_MESSAGE, fallbackUsed));
    }
}