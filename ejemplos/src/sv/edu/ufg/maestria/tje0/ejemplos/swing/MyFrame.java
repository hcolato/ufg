package sv.edu.ufg.maestria.tje0.ejemplos.swing;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame{

  private JTextArea ta1 = new JTextArea(20,40);
  private JTextArea ta2 = new JTextArea(20,40);
  private SplitPanel sp = new SplitPanel();
  private JTabbedPane tp = new JTabbedPane();
  private JTable table = new JTable();
  private JToolBar tb = new JToolBar();
  
  public MyFrame(){
    super("You ain't got thing if you ain't got that swing");
    table.setModel( new MyTableModel() );
    tb.add( new OpenHandler() );
    
    
    tp.add(ta1,"Comments");
    tp.add(ta2,"More Comments");
    tp.add(sp,"Split");
    tp.add(table,"Table Demo");
    this.getContentPane().setLayout( new BorderLayout() );
    this.getContentPane().add(tp,BorderLayout.CENTER);
    this.getContentPane().add(tb,BorderLayout.NORTH);
    this.setJMenuBar( this.getMB() );
    this.pack();
    this.show();
  }
  
  private JMenuBar getMB(){
    JMenuBar bar = new JMenuBar();
    JMenu file = new JMenu("File");
      file.add( new OpenHandler() );
    bar.add(file);
    return bar;
  }
  
  private class OpenHandler extends AbstractAction{
    OpenHandler(){
      super("Open", new ImageIcon("./hello.gif") );
    }
    public void actionPerformed(ActionEvent ev){
      JDialog jd = new JDialog(MyFrame.this,"Yo Dude");  
      jd.setSize(100,100);
      jd.show();
    }
  }
  
  public static void main(String[] args){
    new MyFrame();
  }
  
}
