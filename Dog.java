abstract public class Dog{
	private String name;
	
	public Dog(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public String Speak(){
		return "Eoof";
	}
	
	abstract public double avgBreedWeight();
}
