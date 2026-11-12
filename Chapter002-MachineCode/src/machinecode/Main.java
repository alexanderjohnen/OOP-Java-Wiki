package machinecode;

public class Main
{
    static void main()
    {
        // Maschinensprache vs Programmiersprache
        System.out.println("--------------------------------------------------");
        System.out.println("Maschinensprache = Für Hardware verständlicher Code aus Nullen und Einsen. Jeder Prozessortyp hat einen eigenen Befehlssatz.");
        System.out.println("Höhere Programmiersprache = Für Menschen lesbarer Code (z.B. Java). Ein Übersetzer wandelt ihn in Maschinensprache um.");
        System.out.println();

        // Plattformunabhängigkeit
        System.out.println("Compiler (javac) = Übersetzt den Java-Code vor dem Start in Bytecode (.class-Datei).");
        System.out.println("JVM (Java Virtual Machine) = Führt den Bytecode aus und übersetzt ihn zur Laufzeit in Maschinencode.");
        System.out.println("Jede Kombination aus Betriebssystem und Prozessortyp braucht eine eigene JVM.");
        System.out.println();

        // System Calls
        System.out.println("System Calls = Vom Betriebssystem bereitgestellte Dienste (z.B. \"öffne eine Datei\").");
        System.out.println();

        // VM-Typen
        System.out.println("System-VM (z.B. VirtualBox) = Simuliert einen kompletten Computer.");
        System.out.println("Prozess-VM (JVM) = Simuliert nur so viel, wie ein einzelnes Programm braucht.");
        System.out.println("--------------------------------------------------");
    }

}
