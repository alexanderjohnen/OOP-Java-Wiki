package paradigms;

import shared.ReadFiles;

import javax.swing.*;

public class Main
{
    static void main()
    {
        String test = "Hello World";
        SwingUtilities.invokeLater(() -> new WikiParadigmsGui().show(test));
    }
}