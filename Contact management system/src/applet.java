import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
public class applet extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.PINK);
g.drawOval(40,40,120,150);
g.drawOval(57,75,30,20);
g.drawOval(110,75,30,20);
g.fillOval(68,81,10,10);
g.fillOval(121,81,10,10);
g.drawOval(85,100,30,40);
g.drawLine(77, 148, 128, 148);
g.drawArc(77, 120, 50, 50, 0, -180);
showStatus("This is your face");
}
}
