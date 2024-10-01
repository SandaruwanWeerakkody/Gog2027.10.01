public class Yorkshine extends Dog{
	private String colour;
	private double avgBreedWeight =55;
	
	public Yorkshine(String name,String colour){
		super(name);
		this.colour=colour;
	}
	
	public String Speak(){
		return "woof";
	}
	
	public double avgBreedWeight(){
		return avgBreedWeight;
	}
}
