//My first java applet
import java.applet.Applet;
import java.awt.Graphics;//in awt package we just need is graphics

public class HelloWorldApplet extends Applet
{
  public void paint(Graphics g)//paint method
  {
     g.drawString("Hello World!",150,150);//axis position x,y
  }
}
