package sv.edu.ufg.maestria.tje0.ejemplos.util;

//keyboard utility class
//purpose: make keyboard io easier
import java.io.*;

public class Keyboard{

public static String getString(String prompt){
  System.out.print(prompt);
  String s;
  try{
    s = new BufferedReader(new InputStreamReader(System.in)).readLine();
  }
  catch(Exception ex){
    return null;
  }
  return s;    
}

public static int getInt(String prompt) throws NumberFormatException{
  String s;
  s = getString(prompt);
  int i;
  try{
    i = Integer.parseInt(s);  //MIGHT throw an Exception
    return i;
  }
  catch(NumberFormatException ex){
    String msg;
    msg = ex.getMessage() + " is not an int";
    NumberFormatException ex1;
    ex1 = new NumberFormatException(msg);
    throw ex1; //WILL POSITIVELY throw an Exception
  }
}

public static boolean getBoolean(String prompt) throws NumberFormatException{
  String s;
  s = getString(prompt);
  if( s.equalsIgnoreCase("y") ) return true;
  else if( s.equalsIgnoreCase("yes") ) return true;
  else if( s.equalsIgnoreCase("true") ) return true;        
  else return false;
}  

}  





/*
usage:
String s;
s = Keyboard.getString("Enter your name: ");  
*/


