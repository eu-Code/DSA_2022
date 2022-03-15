class TestAnimal{
	public static void main(String [] args){
		Animal animal = new Animal("Lion",2);
		String animal_name = animal.getName();
		System.out.println("Animal name is "+animal_name);
		System.out.println(animal.getName()+" got "+animal.getNumOfLegs()+" legs");
		animal.setName("Cow");
		System.out.println("Animal name is "+animal.getName());
		animal.setNumOfLegs(3);
		System.out.println(animal.getName()+" got "+animal.getNumOfLegs()+" legs");
	}
}
