import java.util.Scanner;

public class addition {
	  int a,b,sum;
	
	public static void main(String[] args) {
		addition M=new addition();
		addition L=new addition();
		
		M.add();
		M.sum();
		
	}
		  void add() {
			Scanner scan=new Scanner(System.in);
			System.out.println("ENTER a NUMBER");
			a=scan.nextInt();
			b=45;
		}
		 void sum() {	
			sum=a+b;
			display();
		}
		 
		void display() {
			System.out.println("sum is:"+sum );
		}
		
		
		
		
	
}