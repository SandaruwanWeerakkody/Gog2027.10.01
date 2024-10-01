public class DogTest{
	public static void main(String args[]){
		Dog dog1 = new Labrador("Spike","black");
		Dog dog2 = new Yorkshine("hik","White");
		
		
		System.out.println(dog1.getName() + " says "+dog1.Speak());
		System.out.println(dog1.avgBreedWeight());
		
		System.out.println(dog2.getName() + " says "+dog2.Speak());
		System.out.println(dog2.avgBreedWeight());
	}
}
