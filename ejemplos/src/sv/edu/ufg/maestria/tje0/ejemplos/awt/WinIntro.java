package sv.edu.ufg.maestria.tje0.ejemplos.awt;

import java.awt.*;

class WinIntro{
  public static void main(String[] args){
    Frame f1;
    f1 = new Frame("My First Java Window");
    Button b1;
    b1 = new Button("Click me now, ...!");    
    f1.add(b1);
    //did we say where to put the button?
    //did we say how big to make the button?
    //What happens when you resize the window?
    
    //default size of Frame is 0 x 0
    f1.setSize(300,300); //pixels
    f1.show();
  }
}
