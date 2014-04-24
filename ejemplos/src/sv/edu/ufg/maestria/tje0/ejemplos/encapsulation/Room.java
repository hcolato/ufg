package sv.edu.ufg.maestria.tje0.ejemplos.encapsulation;

public class Room {

	private int width;
	  private int length;
	  private double costSY;  
	  
	  public void setLength(int length)throws IllegalArgumentException{
	    if(length < 0 || length > 100) {
	      IllegalArgumentException ex;
	      ex = new IllegalArgumentException("Length must be between 0 and 100 inclusive");
	      throw ex; //pass control (and ex) back to the caller's catch
	    }
	    this.length = length;
	  }  

	  public void setWidth(int width)throws IllegalArgumentException{
	    if(width < 0 || width > 100) {
	      IllegalArgumentException ex;
	      ex = new IllegalArgumentException("Width must be between 0 and 100 inclusive");
	      throw ex; //pass control (and ex) back to the caller's catch
	    }  
	    this.width = width;
	  }  

	  public void setCostSY(double costSY)throws IllegalArgumentException{
	    if(costSY < 0 || costSY > 50) {
	      IllegalArgumentException ex;
	      ex = new IllegalArgumentException("CostSY must be between 0 and 50 inclusive");
	      throw ex; //pass control (and ex) back to the caller's catch
	    }   
	    this.costSY = costSY;
	  }
	  
	  private int getArea(){
	    return this.length * this.width;
	  }  
	  
	  private double getTotal(){
	    return this.getArea() * this.costSY;
	  }

	  public void print(){
	    System.out.println("*** Room ***");
	    System.out.println("L=" + this.length);
	    System.out.println("W=" + this.width);
	    System.out.println("C=" + this.costSY);
	    System.out.println("A=" + this.getArea());
	    System.out.println("T=" + this.getTotal());
	    System.out.println(); //prints blank line
	  }

}
