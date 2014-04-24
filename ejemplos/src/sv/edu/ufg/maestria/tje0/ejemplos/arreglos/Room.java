package sv.edu.ufg.maestria.tje0.ejemplos.arreglos;

public class Room {

	  //instance variables
	  String name;
	  int width;
	  int length;
	  double costSY;  //cost per square yard in dolars
	  int area;  //width * height
	  double total;  //area * costSY

	  //instance methods
	  
	  void calc(){
	    this.area = this.length * this.width;
	    this.total = this.area * this.costSY;
	  }

	  void print(){
	    System.out.println("*** Room: " + this.name + " ***");
	    System.out.println("L=" + this.length);
	    System.out.println("W=" + this.width);
	    System.out.println("C=" + this.costSY);
	    System.out.println("A=" + this.area);
	    System.out.println("T=" + this.total);
	    System.out.println(); //prints blank line
	  }

}
