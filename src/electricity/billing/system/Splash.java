
package electricity.billing.system;

import javax.swing.*;

public class Splash extends JFrame implements Runnable 
{
    Thread t;
    Splash()
    {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/elect.jpg"));
        JLabel image = new JLabel(i1);
        add(image);
        
        
        setVisible(true);
        
        for (int i = 1; i <=500; i+=4) {
            setSize(i, i);
            setLocation(800 - ((i )/2), 500 - (i/2));
             try {
                Thread.sleep(5);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        t = new Thread(this);
        t.start();
        setVisible(true);
    }
    
    public void run() {
        try {
            Thread.sleep(7000);
            setVisible(false);
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[])
    {
        new Splash();
    }
    
}
