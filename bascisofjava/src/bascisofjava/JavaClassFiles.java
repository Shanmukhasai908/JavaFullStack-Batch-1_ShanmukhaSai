package bascisofjava;

public class JavaClassFiles {

	public static void main(String[] args) {
		
		 
		bikes pulsar= new bikes();
		pulsar.speed();
		pulsar.color();
		

	}

}
class bikes{
	int number,model;
  void color() {
	  System.out.println("given color is black");
  }
	void speed() {
		System.out.println("bike's mileage is 100mph");
	}
}
