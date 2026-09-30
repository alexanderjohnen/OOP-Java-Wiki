package paradigms;

import shared.ReadFiles;

import javax.swing.*;
import java.awt.*;

public class WikiParadigmsGui
{
    public void show(String wikiText)
    {
        JFrame frame = new JFrame("Programmier Paradigmen & Prinzipien");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel outerPanel = new JPanel(new FlowLayout());
        frame.add(outerPanel);

        JPanel innerPanel = new JPanel(new GridLayout(0, 1,10,10));
        innerPanel.setPreferredSize(new Dimension(400, 200));
        outerPanel.add(innerPanel);

        JTextArea wikiTextArea = new JTextArea(wikiText);

        // Wichtig: Zeilenumbruch aktivieren, damit der Text nicht horizontal herausragt
        wikiTextArea.setLineWrap(true);
        wikiTextArea.setWrapStyleWord(true);

        // Textfeld sperren (Lese-Modus)
        wikiTextArea.setEditable(false);

        // TextArea in ein ScrollPane packen, um bei längeren Texten scrollen zu können
        JScrollPane scrollPane = new JScrollPane(wikiTextArea);

        innerPanel.add(scrollPane, SwingConstants.CENTER);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
