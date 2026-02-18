
import javax.swing.JOptionPane;

public class MemoryApp{
    public static void main(String[] args) {

        int check = 0;

        do { 
            Memory m1 = new Memory(JOptionPane.showInputDialog("Enter memory type: ").charAt(0), JOptionPane.showInputDialog("Enter memory description: "));
            Memory m2 = new Memory(JOptionPane.showInputDialog("Enter memory type: ").charAt(0), JOptionPane.showInputDialog("Enter memory description: "), 2);
            Memory m3 = new Memory(JOptionPane.showInputDialog("Enter memory type: ").charAt(0), JOptionPane.showInputDialog("Enter memory description: "), Integer.parseInt(JOptionPane.showInputDialog("Enter how long the memory will last for: ")));
            m1.fading(3);
            m2.fading(m2.getLasting());
            m3.fading(m3.getLasting());
            

            check = JOptionPane.showConfirmDialog(new JOptionPane(), "Would you like to add new memories?");
        } while (check == 0);
        

    }
}