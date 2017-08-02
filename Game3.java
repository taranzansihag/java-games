import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Game3 extends Applet implements MouseListener,MouseMotionListener{
int x,y,t,p,q;
 
 public void init(){
 p=375;
 q=165;
 t=455;
   addMouseListener(this);  
   addMouseMotionListener(this);
 }
 
  public void mouseClicked(MouseEvent e){
    Graphics g=getGraphics();
	g.setColor(Color.red);
	g.fillOval(416,340,20,40);
  }
  public void mousePressed(MouseEvent e){ }
  public void mouseReleased(MouseEvent e){ }
  public void mouseEntered(MouseEvent e){ }
  public void mouseExited(MouseEvent e){ }
  public void mouseMoved(MouseEvent e){
      x=e.getX();
	  y=e.getY();
	  repaint();
  }
 public void mouseDragged(MouseEvent e){ }
 public void paint(Graphics g){
  if(p<=345&&x>=345){
   p++;
  }
 if(p>=375&&x<=375){
   p--;
  }
 if(q<=130&&y>=130){
   q++;
  }
  if(q>=180&&y<=180){
   q--;
  }
  if(t>=485&&x<=485){
   t--;
  }
  if(t<=455&&x>=455){
   t++;
  }
  g.setColor(Color.yellow);
  g.fillOval(300,120,250,280);
  
  g.setColor(Color.green);
  g.fillOval(345,180,50,50);
  g.fillOval(455,180,50,50);
  
  g.setColor(Color.black);
  g.fillOval(p,q,20,20);
  g.fillOval(t,q,20,20);
  
  setBackground(Color.pink);
  
  g.drawLine(425,265,410,310);
  g.drawLine(410,310,440,310);
  g.drawLine(440,310,425,265);
  
  g.setColor(Color.green);
  g.fillArc(390,290,70,70,180,180);
 
  }
   /*<applet code="Game3.java" width=1000 height=500> </applet>*/
 } 