package datastorage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main
{
    static void main() throws IOException                                                                                                                      //Allgemeine, vom Compiler erzwungene Exception - SPÄTER ERSETZEN
    {
        String dataStorage1 = Files.readString(Path.of("C:\\Users\\Alexander\\Dokumente\\OOPJavaWiki\\Files\\Chapter001_DataStorage_Bits_Bytes.md"));     // Einbinden der Markdown (.md) Datei
        System.out.print(dataStorage1);                                                                                                                        // Ausgabe über die Konsole
    }
}
