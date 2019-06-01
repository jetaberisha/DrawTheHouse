import java.awt.*;
import javax.swing.*;
public class Houseview extends JPanel
 {public Houseview(int w, int h)
  {
  testHouse j = new testHouse();
  j.width = w;
   j.height = h;
    JFrame my_frame = new JFrame();
    my_frame.getContentPane().add(this);
    my_frame.setTitle("House");
    my_frame.setSize(j.width, j.height);
    my_frame.setVisible(true);
  }
  public void paintComponent(Graphics g)
  { g.setColor(Color.black);
 
  testHouse a= new testHouse();
  a.asllani();
  
     g.drawString(a.l+"",20,20);
     g.drawString(a.l+"",275,110);
     g.drawString(a.z,50,5);
      g.drawString(a.f,50,15);
       g.drawString(a.m,50,25);
    g.drawString(a.ha,50,35);
    g.drawString(a.hb,50,45);
    
    g.drawString(a.a,50,35);
    g.drawString(a.b,50,45);
    g.drawString(a.c,50,55);
    g.drawString(a.Para,0,70);
    g.drawString(a.Dyta,0,80);
    g.drawString(a.Treta,0,90);
    g.drawString(a.Katerta,0,100);
    g.drawString(a.Humbja,0,110);
      }
  
      }
