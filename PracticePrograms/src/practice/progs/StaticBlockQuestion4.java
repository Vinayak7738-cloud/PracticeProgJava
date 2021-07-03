package practice.progs;

	// How can we create object if we make the constructor private

public class StaticBlockQuestion4 {
	
	int age;
	
	static {
		StaticBlockQuestion4 obj1 = new StaticBlockQuestion4();
		
	}
	
	public static int createObject() {
		StaticBlockQuestion4 obj2 = new StaticBlockQuestion4();
		obj2.age = 40;
		return obj2.age;
	}
	
	private StaticBlockQuestion4() {
		age = 30;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlockQuestion4 obj = new StaticBlockQuestion4();
		System.out.println(obj.age);
	}

}
