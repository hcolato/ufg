package sv.edu.ufg.maestria.tje0.ejemplos.awt;

import java.awt.*;

class Grid{
  public static void main(String[] args){
    Frame f   = new Frame("Grid Layout");
    Button b1 = new Button("OK");
    Button b2 = new Button("Cancel");
    Button b3 = new Button("Jump");
    Button b4 = new Button("Throw mama From the Train");            
    
    LayoutManager lo = new GridLayout(4,1);
    f.setLayout(lo);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    
    //f.setSize(300,300);
    f.pack();  //uses preferredSize of components to size the Frame
    f.show();
  }
}