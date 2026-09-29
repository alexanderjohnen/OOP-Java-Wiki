package machinecode;

import shared.ReadFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main
{
    static void main()
    {

        String path1 = "C:\\Users\\Alexander\\Dokumente\\OOPJavaWiki\\Files\\Chapter002_MachineCode_HighLevelLanguages.md";
        String path2 = "C:\\Users\\ajohnen\\82.FIAEQ1_Projekte\\OOP-Java-Wiki\\OOP-Java-Wiki-Dateien\\Chapter002_MachineCode_HighLevelLanguages.md";
        String fallback = """
                --------------------------------------------------
                \u001B[31mDatei wurde nicht gefunden, Fallback wird genutzt:\u001B[0m
                --------------------------------------------------
                Maschinensprache = Für Hardware verständlicher Code bestehend aus Nullen und Einsen, mit je nach Prozessortyp unterschiedlichen Befehlssätzen.
                
                System Calls = Vom Betriebssystem bereitgestellte Dienste/Schnittstellen (z.B. "öffne eine Datei", "zeichne ein Fenster", etc.)
                
                JVM (Java Virtual Machine) = Übersetzt zur Laufzeit Bytecode in Maschinencode. Jede Betriebssystem + Prozessortyp Kombination hat eine eigene JVM-Version.
                
                Unterschied Prozess-VM zu System-VM:
                System-VM (VMware, VirtualBox): Simuliert einen kompletten Computer, auf dem du ein komplett eigenes Betriebssystem installieren und laufen lassen kannst.
                Prozess-VM (JVM): Simuliert nur so viel wie nötig, um ein einzelnes Programm (z.B. eine Java-Anwendung) auszuführen – sie stellt sich selbst als "virtuellen Prozessor" für den Bytecode dar, nutzt aber ganz normal das echte, darunterliegende Betriebssystem für alles andere (Dateien, Netzwerk, etc.).
                """;
        String[] pathArray = {path1, path2};
        String machineCode = ReadFiles.readPath(pathArray, fallback);
        System.out.print(machineCode);
    }

}
