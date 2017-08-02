import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Game2 extends Applet implements MouseListener,MouseMotionListener{
 int x,flagx,flagy,y,a,b,c,d,p,q;
 String s;
 public void init(){
  x=0;
  y=0;
  a=0+a;
  b=90+b;
  c=180+c;
  d=270+d;
  q=470;
   addMouseListener(this);  
   addMouseMotionListener(this);
 }
 
  public void mouseClicked(MouseEvent e){ }
  public void mousePressed(MouseEvent e){ }
  public void mouseReleased(MouseEvent e){ }
  public void mouseEntered(MouseEvent e){ }
  public void mouseExited(MouseEvent e){ }
  public void mouseMoved(MouseEvent e){
    p=e.getX();
   repaint();
 }
 public void mouseDragged(MouseEvent e){ }
 public void paint(Graphics g){
  g.setColor(Color.red);
  g.fillArc(x,y,100,100,a,90);
  g.setColor(Color.green);
  g.fillArc(x,y,100,100,b,90);
  g.setColor(Color.yellow);
  g.fillArc(x,y,100,100,c,90);
  g.setColor(Color.blue);
  g.fillArc(x,y,100,100,d,90);
  setBackground(Color.pink);
  g.fillRect(p-50,q,150,30);
  g.fillRect(p-50,q-300,150,30);
  if(x==0)
     flagx=0;
   if(x==900)
     flagx=1;
  if(x>=(p-50)&&x<=(p+150)&&y==200)
     flagy=0;
 
  if(x>=(p-50)&&x<=(p+250)&&y==370)
     flagy=1;
	 
 if(flagx==0)
  {
    x++;
	a--;
	b--;
	c--;
	d--;
  } 
  else {
	  x--;
	  a++;
	  b++;
	  c++;
	  d++;
	}
  if(flagy==0)
    {
	  y++;
	}
  else
     {
	   y--;
	 }
         try{
            Thread.sleep(10);
           }
        catch(InterruptedException e){}
		repaint();
 }
  /*<applet code="Game2.java" width=1000 height=500> </applet>*/
} 