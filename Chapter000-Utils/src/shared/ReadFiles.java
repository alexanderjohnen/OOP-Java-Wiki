package shared;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFiles
{
    // Wir nutzen eine Konstante für die Fehlernachricht, da diese immer gleich bleibt.
    public static final String FALLBACK_ERROR_MESSAGE = "Datei wurde nicht gefunden, Fallback wird genutzt: ";

    // Liest die erste erreichbare Datei aus der Pfadliste und gibt ihren Inhalt zurück.
    // Sind alle Pfade unerreichbar, wird stattdessen der Fallback-Text zurückgegeben.
    // static: Die Methode gehört zur Klasse, daher braucht man kein ReadFiles-Objekt, um sie aufzurufen
    public static String readPath(String[] pathArray, String fallback)
    {
        // Geht die Pfade der Reihe nach durch (for-each: path ist pro Durchlauf der aktuelle Eintrag)
        for (String path: pathArray)
        {
            try
            {
                // versucht die Pfade der Reihe nach, bis der erste gültige gefunden ist
                // return beendet dabei sofort die ganze Methode (und damit auch die Schleife)
                return Files.readString(Path.of(path));
            } catch (IOException e)
            {
                // Bewusst leer: Bei einem Fehler geht die Schleife einfach mit dem nächsten Pfad weiter
                // Zum Debuggen: Fehlerursache ausgeben
                // System.out.println(e.getMessage());
            }
        }

        // Wird nur ausgeführt, wenn das return der Schleife nicht greift
        return fallback;
    }
}