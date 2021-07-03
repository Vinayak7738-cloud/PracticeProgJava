package practice.progs;

	//Is it possible to compile and run a Java Program without writing main() method?

public class StaticBlocQuestion5 {
	
	static int age = 50;
	
	static {
		System.out.println("static block 1");
	}
	
	static {
		System.out.println("static block 2");
	}
	
	static {
		System.out.println("static block 3");
	}
	

}
