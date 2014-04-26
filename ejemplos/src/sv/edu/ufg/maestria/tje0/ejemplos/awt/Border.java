package sv.edu.ufg.maestria.tje0.ejemplos.awt;

import java.awt.*;

class Border{
  public static void main(String[] args){
    Frame f   = new Frame("Border Layout");
    Button b1 = new Button("OK");
    Button b2 = new Button("Cancel");
    Button b3 = new Button("Jump");
    Button b4 = new Button("Throw mama From the Train");            
    
    LayoutManager lo = new BorderLayout();
    f.setLayout(lo);
    f.add(b1,BorderLayout.NORTH);
    f.add(b2,BorderLayout.EAST);
    f.add(b3,BorderLayout.SOUTH);
    f.add(b4,BorderLayout.CENTER);
    
    //f.setSize(300,300);
    f.pack();  //uses preferredSize of components to size the Frame
    f.show();
  }
}