import  java.awt.*;


class VP extends Frame {
  VP(int xdim, int ydim) {
    setSize(xdim, ydim);
    setBackground(Color.white);
    setVisible(true);
  }

  public void delay(long n) {
    long t1 = System.currentTimeMillis();
    long t2 = t1;
    t2+=n;
    while(t1 < t2) {
      t1 = System.currentTimeMillis();
    }
  }


  public void paint(Graphics g) {
    Color[] box = new Color[10];
    box[0] = new Color(255,0,0);
    box[1] = new Color(0,255,0);
    box[2] = new Color(0,0,255);

    int k;
    int x0 = 250,y0 = 250,r = 50;
    for(k = 0; k < 10; k++) {
      g.setColor(box[k % 3]);
      delay(1000);
      r = 200 - 20 * k;
      g.fillOval(x0 - r , y0 - r, 2 * r, 2 * r);
    }
  }
}


class circle3 {
  public static void main(String args[]) {
    VP vp = new VP(500,500);

  };
}
