package sv.edu.ufg.maestria.tje0.ejemplos.swing;

import javax.swing.*;
import java.awt.*;

public class SplitPanel extends JPanel{
  JSplitPane sp = new JSplitPane();
  JList left = new JList();
  JTextArea right = new JTextArea(20,40);
  
  public SplitPanel(){
    left.setModel( new MyListModel() );
    JScrollPane spLeft = new JScrollPane(left);
    sp.setLeftComponent(spLeft);
    sp.setRightComponent(right);
    this.setLayout( new BorderLayout() );    
    this.add(sp);//defaults to CENTER
  }
  
  private class MyListModel extends AbstractListModel{
    public Object getElementAt(int index) {
      return "Dude # " + index;
    }
    public int getSize(){
      return 100;
    }   
  }

}