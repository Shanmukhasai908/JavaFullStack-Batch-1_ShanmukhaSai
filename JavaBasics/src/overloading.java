
public class overloading {
	public static void main(String[] args) {
		overloading E=new overloading();
		System.out.println(E.add(23, 340));
		System.out.println(E.add(34,24,23));
		
	
	}
	int add(int first ,int second){
		return first+second;
		
	}

int add(int first,int second,int third){
	return first+second+third;
	
}
}