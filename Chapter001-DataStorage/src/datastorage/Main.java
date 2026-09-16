package datastorage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main
{
    static void main()
    {
        // Wir versuchen auf die Datei zuzugreifen
        try
        {
            // Einbinden der Markdown (.md) Datei
            String dataStorage1 = Files.readString(Path.of("C:\\Users\\Alexander\\Dokumente\\OOPJavaWiki\\Files\\Chapter001_DataStorage_Bits_Bytes.md"));

            // Ausgabe über die Konsole
            System.out.print(dataStorage1);

        // Wir fangen den durch die potenziell fehlende Datei verursachten Crash ab und geben den Text als String aus
        } catch (IOException e)
        {
            String fallback = """
                    1 Bit = 0 oder 1 (2 Werte)
                    
                    1 Byte = 8 Bit = 00000000 bis 11111111 (256 Werte)
                    
                    | Dezimal (SI)  | Wert                | Binär          | Wert             |
                    | Kilobyte (KB) | 10³ = 1.000         | Kibibyte (KiB) | 2¹⁰ = 1.024      |
                    | Megabyte (MB) | 10⁶ = 1.000.000     | Mebibyte (MiB) | 2²⁰ = 1.048.576  |
                    | Gigabyte (GB) | 10⁹ = 1.000.000.000 | Gibibyte (GiB) | 2³⁰ ≈ 1,07 Mrd.  |
                    | Terabyte (TB) | 10¹²                | Tebibyte (TiB) | 2⁴⁰              |
                    """;

            System.err.println("Datei wurde nicht gefunden, Fallback wird genutzt:");
            System.out.println("--------------------------------------------------");
            System.out.println(fallback);
        }

    }
}
