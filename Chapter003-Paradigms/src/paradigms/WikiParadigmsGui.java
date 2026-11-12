package paradigms;

import javax.swing.*;
import java.awt.*;

public class WikiParadigmsGui
{
    // Baut das Fenster auf und zeigt den übergebenen Wiki-Text an
    public void show(String wikiText, String fallbackErrorMessage, boolean fallbackUsed)
    {

        // Das sichtbare Fenster mit Titelleiste
        JFrame frame = new JFrame("Programmier Paradigmen & Prinzipien");

        // Beendet das Programm, wenn das Fenster geschlossen wird
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Äußeres Panel: FlowLayout ordnet seine Inhalte der Reihe nach an (zentriert, in ihrer Wunschgröße)
        JPanel outerPanel = new JPanel(new FlowLayout());
        frame.add(outerPanel);

        // Inneres Panel: BorderLayout, um Komponenten (Label + TextArea) gezielt anordnen zu können
        JPanel innerPanel = new JPanel(new BorderLayout());

        // Wunschgröße des inneren Panels, daran orientiert sich pack() später
        innerPanel.setPreferredSize(new Dimension(400, 200));
        outerPanel.add(innerPanel);

        JLabel fallbackErrMsg = new JLabel(fallbackErrorMessage);

        if (fallbackUsed)
        {
            innerPanel.add(fallbackErrMsg,BorderLayout.NORTH);
            fallbackErrMsg.setForeground(Color.RED);
        }

        // Eigene Klasse für ScrollPane ausgelagert
        JScrollPane scrollPane = buildScrollPane(wikiText);

        // ScrollPane ins innere Panel einfügen
        innerPanel.add(scrollPane, BorderLayout.CENTER);

        // Fenstergröße automatisch an den Inhalt anpassen (vor dem Zentrieren, damit die Größe feststeht)
        frame.pack();
        // Fenster in der Bildschirmmitte positionieren (null = kein Bezugsfenster)
        frame.setLocationRelativeTo(null);
        // Fenster anzeigen
        frame.setVisible(true);
    }

    private static JScrollPane buildScrollPane(String wikiText)
    {
        JTextArea wikiTextArea = new JTextArea(wikiText);

        // Wichtig: Zeilenumbruch aktivieren, damit der Text nicht horizontal herausragt
        wikiTextArea.setLineWrap(true);

        // Umbruch nur an Wortgrenzen, damit keine Wörter mitten drin getrennt werden
        wikiTextArea.setWrapStyleWord(true);

        // Textfeld sperren (Lese-Modus)
        wikiTextArea.setEditable(false);

        // TextArea in ein ScrollPane packen, um bei längeren Texten scrollen zu können

        return new JScrollPane(wikiTextArea);
    }
}