package sv.edu.ufg.maestria.tje0.ejemplos.swing;

import javax.swing.*;
import javax.swing.table.*;

public class MyTableModel extends AbstractTableModel{

  public int getRowCount(){
    return 10;
  }
  
  public int getColumnCount(){
    return 10;
  }
  
  public Object getValueAt(int row, int column){
    return (row * column) + "";
  }
  
  public String getColumnName(int i){
    return "Col " + i;
  }
  
  public Class getColumnClass(int i){
    return String.class;
  }  


}