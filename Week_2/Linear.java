/*
 * Linear time complexity
 */
import java.io.FileWriter;   
import java.io.IOException;
class Linear{
	public static void main(String [] args){
		try {
		      FileWriter myWriter = new FileWriter("linear.csv");
		      myWriter.write("n,time\n");
		      int n=100;
			for(n=1000;n<1000000000;n*=2){
				long sum =0;	
				long start_time = System.nanoTime();
				for(int i=0;i<n;i++){
					sum+=i;
				}
				long end_time = System.nanoTime();
				myWriter.write(n+","+(end_time-start_time)+"\n");
			}
		      myWriter.close();} 
		catch (IOException e) {}
		
	}

}
