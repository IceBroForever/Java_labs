import javax.swing.*;

public class NameProvider {
    public String getName() {
        return JOptionPane.showInputDialog("What is your name?");
    }
}