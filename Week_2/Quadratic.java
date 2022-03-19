/*
 * Quadratic time complexity
 */
import java.io.FileWriter;   
import java.io.IOException;

class Quadratic{
	public static void main(String [] args){
		try {
		      FileWriter myWriter = new FileWriter("quadratic.csv");
		      myWriter.write("n,time\n");
		      int n=100;
			for(n=1000;n<1000000;n*=2){
				long sum =0;	
				long start_time = System.nanoTime();
				for(int i=0;i<n;i++){
					for(int j=0;j<n;j++){
						sum+=i;
					}
				}
				long end_time = System.nanoTime();
				myWriter.write(n+","+(end_time-start_time)+"\n");
			}
		      myWriter.close();} 
		catch (IOException e) {}
		
	}
}
