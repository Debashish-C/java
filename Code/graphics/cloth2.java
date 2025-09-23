import  java.awt.*;


public class cloth2 {
  public static void main(String args[]) {
    ViewPort  vp = new ViewPort(800,750);
  };
}


class ViewPort extends Frame {
  ViewPort(int xdim,int ydim) {
    setSize(xdim, ydim);
    setBackground(Color.white);
    setVisible(true);
  }

  public void delay(long n) {
    long t1 = System.currentTimeMillis();
    long t2 = t1;
    t1+=n;
    while(t2 < t1)
      t2 = System.currentTimeMillis();
  }

  public void paint(Graphics g) {
    int i,j,k;
    int x0 = 0,y0 = 0,x,y;
    int height = 100,width = 100;
    for(i = 0; i < 8; i++) {
      for(j = 0; j < 7; j++) {
        delay(100);
        x= x0 + i * width;
        y = y0 + j * height;
        g.setColor(Color.green);
        g.drawRect(x,y,20,80);
        g.fillRect(x,y,20,80);
        g.setColor(Color.blue);
        g.drawRect(x+20,y,20,80);
        g.fillRect(x+20,y,20,80);
        g.setColor(Color.black);
        g.drawRect(x+40,y,20,80);
        g.fillRect(x+40,y,20,80);

      }
    }
  }
}


