package shared;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFiles
{

    public static String readPath(String[] pathArray, String fallback)
    {
        for (String path: pathArray)
        {
            try
            {
                // versucht die Pfade der Reihe nach, bis der erste gültige gefunden ist
                return Files.readString(Path.of(path));
            } catch (IOException e)
            {
                // System.out.println(e.getMessage());
            }
        }

        // Wird nur ausgeführt, wenn das return der Schleife nicht greift
        return fallback;
    }
}
