package sv.edu.ufg.maestria.tje0.ejemplos.applets;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class GraphicApplet extends Applet{

  Button bDraw = new Button("Draw");
  AppletContext browser;
  Image img;
  boolean showLine;

  public void init(){
    this.setLayout( new BorderLayout() );
    this.add(bDraw, BorderLayout.NORTH );
    browser = this.getAppletContext();
    URL u;
    try{
      u = new URL( this.getDocumentBase(), "car.gif");
      img = browser.getImage(u);
    }
    catch(MalformedURLException ex){
      //show up in Netscape's Java Console window
      System.out.println(ex);
    }
    bDraw.addActionListener( new DrawHandler() );
  }
  
  private class DrawHandler implements ActionListener{
    public void actionPerformed(ActionEvent ev){
      showLine = !showLine;
      repaint();//clears screen, then calls paint
    }  
  }
  
  public void paint(Graphics g){
    if( this.showLine ) {
      g.drawLine(40,40,70,70);
      if(img != null){
        g.drawImage(img,10,80,this);
      }
    }
    System.out.println("paint");
  }
  
} 
