import javax.swing.*;

public class BookApp {
 String bookName;
    public static void main(String[] args) {
        System.out.println("TRACE: main is starting");

        BookApp bookApp = new BookApp();

        bookApp.getBookName();

        System.out.println("TRACE: main is ending");
    }

    private void getBookName() {

        bookName = JOptionPane.showInputDialog("What book do you want to review");


    }

}
