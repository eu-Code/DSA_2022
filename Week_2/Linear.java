/*
 * Linear time complexity
 */
import java.io.FileWriter;   
import java.io.IOException;
class Linear{
	public static void main(String [] args){
		try {
			// csv file created to store time_elapsed for different values  of n
		      	FileWriter myWriter = new FileWriter("linear.csv");
		      	myWriter.write("n,time\n");
		      	// varying the size of n
			for(int n=1000;n<1000000000;n*=2){
				long sum =0;	
				// logging time elapsed for different size of n
				long start_time = System.nanoTime();
				// begining of a for loop with linear time complexity
				for(int i=0;i<n;i++){
					sum+=i;
				}
				// end of a for loop with linear time complexity
				long end_time = System.nanoTime();
				myWriter.write(n+","+(end_time-start_time)+"\n");
			}
		      	myWriter.close();} 
		catch (IOException e) {}
		
	}

}
