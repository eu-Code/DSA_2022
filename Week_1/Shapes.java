/*
 * Drawing shapes using for loop
 */
public class Shapes{
	public static void main(String [] args){
		// Triangle
		System.out.println("Triangle");
		for(int i=0;i<5;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		// Another Triangle
		System.out.println("Another Triangle");
		for(int i=0;i<5;i++){
			for(int j=5;j>i;j--){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		// Half Diamond
		System.out.println("Half Diamond");
		for(int i=0;i<5;i++){
			for(int j=5;j>i;j--){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		// Diamond
		System.out.println("Diamond");
		for(int i=0;i<5;i++){
			for(int j=5;j>i;j--){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=0;i<5;i++){
			for(int j=0;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=5;j>i;j--){
				System.out.print("*");
			}
			for(int j=5;j>i;j--){
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

