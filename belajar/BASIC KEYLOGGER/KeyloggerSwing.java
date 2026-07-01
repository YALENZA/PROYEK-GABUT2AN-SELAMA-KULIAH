import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class KeyloggerSwing extends JFrame implements KeyListener 
{
    public KeyloggerSwing() 
    {
        setTitle("Test Keylogger");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label = new JLabel("Ketik apapun", SwingConstants.CENTER);
        add(label);
        
        addKeyListener(this);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
    String tombol = KeyEvent.getKeyText(e.getKeyCode());
    System.out.println("Ditekan: " + tombol);
    
    try 
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter("keylog.txt", true));
        writer.write(tombol + "\n");
        writer.close();
    } 
    
    catch (IOException ex) 
    {
        System.out.println("Error nulis file: " + ex.getMessage());
    }
}

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) 
    {
        new KeyloggerSwing();
    }
}