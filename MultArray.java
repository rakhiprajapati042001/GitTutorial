public class MultArray {

	static int sum(int[][] no){
		int total=0;
		for(int[] ii:no) {
		       for(int i:ii) 
		       {
		         total= total + i;
		         System.out.println(total);
		        }
		}
	
	  return total;
	}
	
	 

	
	public static void main(String[] args) {
		 Array.sum(new int[][]{{10,20},{10,60,70}});
		
	}
}