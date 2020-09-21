import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // establish main frame in which program will run
        TranspoFrame myTranspoFrame = new TranspoFrame("Transporter Room");
        myTranspoFrame.setSize(300, 200);
        myTranspoFrame.setLocationRelativeTo(null);
        myTranspoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // show everything to the user
        myTranspoFrame.setVisible(true);
    }
}
