class Animal{
	private String name = "Dog";
	private int num_of_legs = 4;
	// constructor
	Animal(String name, int num_of_legs){
		this.name = name;
		this.num_of_legs = num_of_legs;
	}
	// get animal name
	public String getName(){
		return this.name;
	}
	// set animal name
	public void setName(String name){
		this.name = name;
	}
	// get number of legs
	public int getNumOfLegs(){
		return this.num_of_legs;
	}
	// set number of legs
	public void setNumOfLegs(int num_of_legs){
		this.num_of_legs = num_of_legs;
	}
	
}
