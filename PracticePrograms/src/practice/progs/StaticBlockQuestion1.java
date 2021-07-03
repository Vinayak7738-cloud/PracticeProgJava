package practice.progs;

	//Explain static block in java - static bloack executed before main() method

public class StaticBlockQuestion1 {
	
	static {
		System.out.println("static block 1");
	}
	
	static {
		System.out.println("static block 2");
	}
	
	static {
		System.out.println("static block 3");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main() method");
		
	}
	
	static {
		System.out.println("static block 4");
	}

}
