/*
 * Quadratic time complexity
 */
import java.io.FileWriter;   
import java.io.IOException;

class Quadratic{
	public static void main(String [] args){
		try {
			// Csv file created to store time elpased for different valuse of n
		      	FileWriter myWriter = new FileWriter("quadratic.csv");
		      	myWriter.write("n,time\n");
		      	// varying the size of n
			for(n=1000;n<1000000;n*=2){
				long sum =0;	
				// logging time elapsed
				long start_time = System.nanoTime();
				// begining of a nested for loop with quadratic time complexity
				for(int i=0;i<n;i++){
					for(int j=0;j<n;j++){
						sum+=i;
					}
				}
				// end of for loop with quadratic time complexity
				long end_time = System.nanoTime();
				myWriter.write(n+","+(end_time-start_time)+"\n");
			}
		      	myWriter.close();} 
		catch (IOException e) {}
		
	}
}
