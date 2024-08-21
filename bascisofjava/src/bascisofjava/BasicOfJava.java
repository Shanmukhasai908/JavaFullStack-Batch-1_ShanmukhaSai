package bascisofjava;




public class BasicOfJava {
	int a,b;

	public static void main(String[] args) {
		BasicOfJava K=new BasicOfJava();
		java.util.Scanner theScan=new java.util.Scanner(System.in);
		System.out.println("enter two numbers");
		int a =theScan.nextInt();
		int b=theScan.nextInt();
		K.add();
		

	}
	
    void add() {
    	int sum = a+b;
    	System.out.println("the sum is:" +sum);
           	
               }
}
