import javax.swing.*;
import java.awt.*;

public class BookApp {
 String bookName;
    public static void main(String[] args) {
        System.out.println("TRACE: main is starting");

        BookApp bookApp = new BookApp();

        bookApp.getBookName();

        bookApp.buildGui();


        System.out.println("TRACE: main is ending");
    }

    /**
     * Build and connect the gui elements of our application.
     */
    private void buildGui() {
        JFrame mainFrame = new JFrame();

        // design the main "window"
        mainFrame.setSize(800,300);
        mainFrame.setTitle("Book Review for: " + bookName);
        mainFrame.getContentPane().setBackground(new Color(95, 200, 20));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create and add a label
        JLabel labInstruction = new JLabel("hello, tell us if you like the book '" + bookName + "'");
        mainFrame.add(labInstruction);


        mainFrame.setVisible(true);
    }

    private void getBookName() {
        bookName = JOptionPane.showInputDialog("What book do you want to review");
    }

}
