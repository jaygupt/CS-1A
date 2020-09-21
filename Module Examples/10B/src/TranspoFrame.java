import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TranspoFrame extends JFrame {
    // member data (instance variables)
    private JButton myButton;
    private JTextField myTextArea;
    private JLabel myLabel;

    // TranspoFrame constructor
    public TranspoFrame(String title) {
        // pass the title up to JFrame constructor
        super(title);

        // set up layout which will control placement of buttons
        FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 5, 20);
        setLayout(layout);

        // 3 controls: label, text field, button
        myLabel = new JLabel("Friend's Name: ");
        myTextArea = new JTextField(10);
        myButton = new JButton("Press Here to See Friend: ");

        add(myLabel);
        add(myTextArea);
        add(myButton);

        // create a Listener for the JButton and register it
        myButton.addActionListener(new SeeFriendListener());
    }

    class SeeFriendListener implements ActionListener {
        // event handler for JButton
        public void actionPerformed(ActionEvent e) {
            String friend = myTextArea.getText();
            if (friend != null && friend.length() >= 2) {
                char first = friend.charAt(0);
                if (Character.isLetter(first)) {
                    // good friend's name
                    JOptionPane.showMessageDialog(null, "Please wait while we locate " + friend + "...");
                    return;
                }
            }

            // fall through, unacceptable friend's name
            JOptionPane.showMessageDialog(null, "Name must be at least two characters, and start with a letter.");
            return;
        }
    }
}
