public class Labrador extends Dog{
	private String colour;
	private double avgBreedWeight =75;
	
	public Labrador(String name,String colour){
		super(name);
		this.colour=colour;
	}
	
	public String Speak(){
		return "Aoof";
	}
	
	public double avgBreedWeight(){
		return avgBreedWeight;
	}
	
}
