package practice.progs;

	//Can we initialize member variables within static block
public class StaticBlockQuestion6 {
	
	String name;
	static int age;
	static {
		//name = "Vinayak"; cant bcoz it is non-static, 
		//and non-static either u use in static block or in static method, u have to to create object
		StaticBlockQuestion6 obj6 = new StaticBlockQuestion6();
		obj6.name = "Vinayak"; // yes we can initialize member variable in static block
		age = 25;
		
		System.out.println(obj6.name + " " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
	}

}
