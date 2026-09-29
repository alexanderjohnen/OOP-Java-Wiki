Maschinensprache = Für Hardware verständlicher Code bestehend aus Nullen und Einsen, mit je nach Prozessortyp unterschiedlichen Befehlssätzen.
System Calls = Vom Betriebssystem bereitgestellte Dienste/Schnittstellen (z.B. "öffne eine Datei", "zeichne ein Fenster, etc.)
JVM (Java Virtual Machine) = Übersetzt zur Laufzeit Bytecode in Maschinencode. Jede Betriebssystem + Prozessortyp Kombination hat eine eigene JVM-Version.

Unterschied Prozess-VM zu System-VM:
- System-VM (VMware, VirtualBox): Simuliert einen kompletten Computer, auf dem du ein komplett eigenes Betriebssystem installieren und laufen lassen kannst.
- Prozess-VM (JVM): Simuliert nur so viel wie nötig, um ein einzelnes Programm (z.B. eine Java-Anwendung) auszuführen – sie stellt sich selbst als "virtuellen Prozessor" für den Bytecode dar, nutzt aber ganz normal das echte, darunterliegende Betriebssystem für alles andere (Dateien, Netzwerk, etc.).