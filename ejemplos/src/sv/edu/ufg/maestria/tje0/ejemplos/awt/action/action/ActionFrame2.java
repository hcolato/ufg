package sv.edu.ufg.maestria.tje0.ejemplos.awt.action.action;

import java.awt.*;
import java.awt.event.*;

import sv.edu.ufg.maestria.tje0.ejemplos.util.Quitter;

public class ActionFrame2 extends Frame{

  private Button b1;
  private Button b2;
  private Button b3;
  
  public ActionFrame2(){
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
    b1.addActionListener(   new ExitHandler()  );
    b2.addActionListener(   new SaveHandler()  );    
    b3.addActionListener(   new OpenHandler()  );
  }
  
  private class ExitHandler implements ActionListener{
    public void actionPerformed(ActionEvent ev){
      System.exit(0);
    }
  }

  private class OpenHandler implements ActionListener{
    private int counter = 1;
    public void actionPerformed(ActionEvent ev){
      Frame f = new Frame("New Window " + this.counter++);
      f.addWindowListener( new Quitter(Quitter.DISPOSE) );
      f.setSize(300,100);
      f.setLocation(20+this.counter*20, 20+this.counter*20);
      f.show();    
    }
  }
  
  private class SaveHandler implements ActionListener{
    public void actionPerformed(ActionEvent ev){
      Toolkit tk = ActionFrame2.this.getToolkit();
      Dimension d = tk.getScreenSize();
      System.out.println("H=" + d.height);
      System.out.println("W=" + d.width);      
     }
  }  
  
  public static void main(String[] args){
    new ActionFrame2();
  }
  

}











  