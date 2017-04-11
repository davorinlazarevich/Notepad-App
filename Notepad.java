import javax.swing.*;
import java.awt.event.*;

/**
 * Created by Davorin on 4/10/2017.
 */

public class Notepad implements ActionListener {
    JFrame frame;
    JMenuBar MenuBar;
    JMenu file,edit,help;
    JMenuItem cut,copy,paste,selectAll;
    JTextArea textArea;

    public Notepad(){
        frame = new JFrame("Davorin's Notepad");

        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        MenuBar = new JMenuBar();
        MenuBar.setBounds(5,5,500,40);

        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);

        MenuBar.add(file);
        MenuBar.add(edit);
        MenuBar.add(help);

        textArea = new JTextArea();
        textArea.setBounds(5,50,500,500);

        frame.add(MenuBar);
        frame.add(textArea);

        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut)
            textArea.cut();
        if (e.getSource() == paste)
            textArea.paste();
        if (e.getSource() == copy)
            textArea.copy();
        if (e.getSource() == selectAll)
            textArea.selectAll();
    }
    public static void main(String[] args) {
        new Notepad();
    }

}
