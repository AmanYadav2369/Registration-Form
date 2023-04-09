import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Home extends JFrame
{
Container c;
JLabel head;

Home(){
c=getContentPane();
c.setLayout(null);
c.setBackground(Color.CYAN);

head=new JLabel("WELCOME");
head.setBounds(180,10,300,40);
head.setFont(new Font("Arial", Font.BOLD, 35));
head.setForeground(Color.BLUE);
c.add(head);

setSize(600,500);
setLocationRelativeTo(null);
setTitle("home page...");
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[])
{
Home h=new Home();
}
}