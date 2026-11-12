package datastorage;

public class Main
{
    static void main()
    {
        // Bit und Byte
        System.out.println("--------------------------------------------------");
        System.out.println("1 Bit = 0 oder 1 (2 Werte)");
        System.out.println("1 Byte = 8 Bit = 00000000 bis 11111111 (256 Werte)");
        System.out.println();

        // Binäre Funktionweise von Computern
        System.out.println("Computer speichern alles als Nullen und Einsen, weil Strom entweder an oder aus ist.");
        System.out.println();

        // Système International d’Unités (Internationale Einheitensystem)
        System.out.println("Dezimal (SI): Kilobyte (KB) = 10^3 = 1.000 Byte");
        System.out.println("Dezimal (SI): Megabyte (MB) = 10^6 = 1.000.000 Byte");
        System.out.println("Binär: Kibibyte (KiB) = 2^10 = 1.024 Byte");
        System.out.println("Binär: Mebibyte (MiB) = 2^20 = 1.048.576 Byte");
        System.out.println();

        // Merkregel Exponenten
        System.out.println("Merkregel: Dezimal steigt der Exponent um 3 (10^3, 10^6, ...), binär um 10 (2^10, 2^20, ...).");
        System.out.println("--------------------------------------------------");

        // Alternativer String, weil schön
        // String dataStorage = """
        //            1 Bit = 0 oder 1 (2 Werte)
        //
        //            1 Byte = 8 Bit = 00000000 bis 11111111 (256 Werte)
        //
        //            | Dezimal (SI)  | Wert                | Binär          | Wert             |
        //            | Kilobyte (KB) | 10³ = 1.000         | Kibibyte (KiB) | 2¹⁰ = 1.024      |
        //            | Megabyte (MB) | 10⁶ = 1.000.000     | Mebibyte (MiB) | 2²⁰ = 1.048.576  |
        //            | Gigabyte (GB) | 10⁹ = 1.000.000.000 | Gibibyte (GiB) | 2³⁰ ≈ 1,07 Mrd.  |
        //            | Terabyte (TB) | 10¹²                | Tebibyte (TiB) | 2⁴⁰              |
        //            """;
        // System.out.println(dataStorage);
        // System.out.println("--------------------------------------------------");
    }
}
