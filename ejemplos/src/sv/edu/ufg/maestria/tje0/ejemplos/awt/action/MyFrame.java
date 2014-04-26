package sv.edu.ufg.maestria.tje0.ejemplos.awt.action;

import java.awt.*;

@SuppressWarnings("serial")
public class MyFrame extends Frame{

  TextField t1 = new TextField();
  TextArea ta = new TextArea();
  Button b1 = new Button("Exit");
  
  public MyFrame(String title){
    super(title);
    this.setLayout( new BorderLayout() );
    this.add( t1, BorderLayout.NORTH );
    this.add( ta, BorderLayout.CENTER );
    this.add( b1, BorderLayout.SOUTH );
    this.pack();
    this.show();
  }
  
  public boolean handleEvent(Event ev){
    if(ev.target == b1 && ev.id == Event.ACTION_EVENT){//button
      System.exit(0);
      return true;
    }
    else if(ev.target == this && ev.id == Event.WINDOW_DESTROY){
      System.exit(0);
      return true;
    }
    else if(ev.target == t1 && ev.id == Event.ACTION_EVENT){
      String s = t1.getText();
      t1.setText("");
      ta.append(s + "\n");
      return true;
    }
    else{    
      //System.out.println(ev);
      return false;
    }
  }

}


















