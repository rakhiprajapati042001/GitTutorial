package chapter2;
import java.util.Scanner;
public class LargestNumber {
	
     public void find(int a,int c ,int b){
    	 System.out.println("welcomeeeeee");
        	int d= a>c?a>b?a:b:c>b?c:b;

    	   
    	  System.out.println("the greatest value is"+" "+d);
    	   return ;
     }
    	   

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		  System.out.println("enter the  value of a  ");
			int a =sc.nextInt();
		
		 System.out.println("enter the  value of b  ");
			int b =sc.nextInt();
		 System.out.println("enter the  value of c  ");
         		int c =sc.nextInt();

		 LargestNumber ob=new LargestNumber();
		
		 ob.find(a,c,b);
			
		}
	}


