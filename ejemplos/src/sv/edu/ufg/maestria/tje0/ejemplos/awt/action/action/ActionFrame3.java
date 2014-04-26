package sv.edu.ufg.maestria.tje0.ejemplos.awt.action.action;

import java.awt.*;
import java.awt.event.*;

import sv.edu.ufg.maestria.tje0.ejemplos.util.Quitter;

public class ActionFrame3 extends Frame{

  private Button b1 = new Button("Click Me");
  private TextField t1 = new TextField(20);
  private List l1 = new List();
  private TextArea ta = new TextArea();
  
  public ActionFrame3(){
    super("Action Frame 3");
    l1.add("John Lennon");
    l1.add("Paul McCartney");
    l1.add("George Harison");
    l1.add("Ringo Star");
    this.setLayout( new BorderLayout() );
    this.add(b1, BorderLayout.SOUTH );
    this.add(t1, BorderLayout.NORTH );
    this.add(l1, BorderLayout.EAST);
    this.add(ta, BorderLayout.CENTER);
    this.pack();
    this.show();
    this.addWindowListener( new Quitter() );
    b1.addActionListener( new ActionHandler() );
    t1.addActionListener( new ActionHandler() );
    l1.addActionListener( new ActionHandler() );
    b1.setActionCommand("WhoHa");
  }
  
  private class ActionHandler implements ActionListener{
    public void actionPerformed(ActionEvent ev){
      ta.append( ev.getActionCommand() + "\n");
    }
  } 
  
  public static void main(String[] args){
    new ActionFrame3();
  }
  
} 









 