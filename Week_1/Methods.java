/*
* Conditionals and methods
*/
class Methods{
	public static void main(String[] args){
		int cond =4;
		if(cond==1){
			triangle_1();
		}
		else if(cond==2){
			triangle_2();
		}
		else if(cond==3){
			half_diamond();
		}
		else if(cond==4){
			diamond();
		}
	}
	/*
	* let's define triangle one here
	*/
	
	public static void triangle_1(){
		// Triangle 1
		for(int i=0;i<5;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*
	* let's defind triangle_2 here
	*/
	public static void triangle_2(){
		// Triangle 2
		for(int i=0;i<5;i++){
			for(int j=5;j>i;j--){
				System.out.print(" ");
			}
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*
	* let's define half_diamond here
	*/
	public static void half_diamond(){
		// Half Diamond
		for(int i=0;i<5;i++){
			for(int j=5;j>i;j--){
				System.out.print(" ");
			}
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/*
	* let's define diamond here
	*/
	
	public static void diamond(){
		// Diamond
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
