package sv.edu.ufg.maestria.tje0.ejemplos.awt.action.action;

import java.awt.*;
import java.awt.event.*;

import sv.edu.ufg.maestria.tje0.ejemplos.util.Quitter;

public class ActionFrame1 extends Frame implements ActionListener{

  private Button b1;
  private Button b2;
  private Button b3;
  
  public ActionFrame1(){
    super("Action Jackson");
    b1 = new Button("Exit");
    b2 = new Button("Save");
    b3 = new Button("Open another Window");
    this.setLayout( new FlowLayout() );
    this.add(b1);
    this.add(b2);
    this.add(b3);
    this.pack();
    this.show();
    this.addWindowListener( new Quitter() );
    b1.addActionListener( this );
    b3.addActionListener( this );
  }
  
  public void actionPerformed(ActionEvent ev){
    if(ev.getSource() == b1) System.exit(0);
    else{
      Frame f = new Frame("New Window");
      f.addWindowListener( new Quitter(Quitter.DISPOSE) );
      f.setSize(100,100);
      f.show();    
    }
  }
  
  public static void main(String[] args){
    new ActionFrame1();
  }
  

}











  