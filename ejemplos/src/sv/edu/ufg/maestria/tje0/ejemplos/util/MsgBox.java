package sv.edu.ufg.maestria.tje0.ejemplos.util;

import java.awt.*;
import java.awt.event.*;

public class MsgBox extends Dialog{

  private Label lblMsg;
  private Button btnOk = new Button("OK");
  
  public MsgBox(Frame parent, String msg){
    super(parent,"CNR",true);
    lblMsg = new Label(msg);
    this.setLayout( new FlowLayout() );
    this.add(lblMsg);
    this.add(btnOk);
    this.pack();
    btnOk.addActionListener( new OkHandler() );
    this.show();  
  }
  
  public MsgBox(Frame parent, Object o){
    this(parent,o.toString());  
  }
  
  private class OkHandler implements ActionListener{
    public void actionPerformed(ActionEvent ev){
      //ev.getWindow().dispose();//what wrong with this line?
      //a: ActionEvent does not HAVE a getWindow() method
      //luckily, we are IN the window we want to dispose
      //so use dispose() or MsgBox.this.dispose();
      dispose();
    }  
  }
  
  public static void main(String[] args){
    Frame f = new Frame();
    f.setSize(400,400);
    new MsgBox(f,"Que Pasa");
    System.out.println("If Modal, when will we see this message?");
  }

}  












