package sv.edu.ufg.maestria.tje0.ejemplos.util;

import java.awt.event.*;

public class Quitter extends WindowAdapter{

  public static final int EXIT    =  0;
  public static final int DISPOSE =  1;
  
  private int mode;

  public Quitter(int mode){
    this.mode = mode;    
  }
  
  public Quitter(){
    this.mode = Quitter.EXIT;
  }

  public void windowClosing(WindowEvent ev){
    if( this.mode == Quitter.EXIT) System.exit(0);
    else ev.getWindow().dispose();
  }

}






