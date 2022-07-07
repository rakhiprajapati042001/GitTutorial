package chapter1;
 import java.util.Scanner;
public class Radius {
	
	
	   
    	
	Scanner sc=new Scanner(System.in);
	 int r=sc.nextInt();
		
    public   double circumfrance(){
    	
    	double circumf=(2* Math.PI *r); 
          System.out.println(circumf);     //calculate circumfrance
	      return circumf;
//	
//	
      }
    
    public double area() {         
    	
    	double ar=Math.PI* r*r;
    	System.out.println(ar);         // calculate area
    	return ar;
    }

	public static void main(String[] args) {
		
		System.out.println("welcome");
	    
		
		
		   
	 //  Scanner sc=new Scanner(System.in);
		 
			
	   Radius ob=new Radius();
	   ob.circumfrance();
	   ob.area();
	  
	   
}
}
	
	
	
