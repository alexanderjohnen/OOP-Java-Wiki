package paradigms;

import javax.swing.*;
import static shared.ReadFiles.FALLBACK_ERROR_MESSAGE;
import static shared.ReadFiles.readPath;

public class Main
{
    static void main()
    {
        String fallback = "Noch keinen Inhalt";
        String path1 = "C:\\Users\\Alexander\\Dokumente\\OOPJavaWiki\\Files\\PLACEHOLDER";
        String path2 = "C:\\Users\\ajohnen\\82.FIAEQ1_Projekte\\OOP-Java-Wiki\\OOP-Java-Wiki-Dateien\\PLACEHOLDER";
        String[] pathArray = {path1, path2};
        String paradigms = readPath(pathArray, fallback);
        boolean fallbackUsed = paradigms.equals(fallback);

        SwingUtilities.invokeLater(() -> new WikiParadigmsGui().show(paradigms, FALLBACK_ERROR_MESSAGE, fallbackUsed));
    }
}