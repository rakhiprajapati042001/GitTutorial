package array;

public class BubbleShort {

//	public static void main(String[] args) {
//		  int temp;
//		   int[] a= {10,20,30,67,22,34,66,109};
//		   for(int i=0;i<a.length-1;i++) {
//			   if(a[i]>a[i+1]) {
//			   temp=a[i+1];
//			   a[i+1]=a[i];
//			   a[i]=temp;
//		   }
//		   }
//		   int j=a.length-1;
//		System.out.println(a[j]);
	
	
	public static void main(String[] args) {
		int temp;
		 boolean flag=false;
		    int [] a= {10,20,30,11,34,90};
		    for(int i=1;i<a.length;i++) {
		    	
		    	for(int j=0;j<=a.length-1-i;j++) {
		    		   
		    		 if(a[j]>a[j+1]) 
		    		 {
		  			   temp=a[j+1];
		  			   a[j+1]=a[j];
		  			   a[j]=temp;
		  			   flag=true;
	  		   }
		    	
		    		 System.out.println(a[j]);
		    	}
		    	
		    	
		    	if(flag==false)
		    	{
		    		break;
		    	}
		    	
		    	
		    	
		    }
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	}

}
