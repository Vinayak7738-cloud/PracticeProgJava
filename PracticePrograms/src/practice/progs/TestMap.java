package practice.progs;

import java.util.HashMap;
import java.util.Map;

/*Why HashMap Key should be immutable in Java??
Why String is popular HashMap in Java??
*/
public class TestMap {

	public static void main(String[] args) {
		
		Map<Employee, String> empMap = new HashMap<Employee, String>();
		
		Employee e1 = new Employee("Vinayak", 26);
		
		empMap.put(e1, "Permanent");
		
		e1.setAge(27);
		
		//empMap.put(e1, "Temp");
		
		//System.out.println(empMap.get(e1));
		
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		String e11 = "Tom";
		m1.put(e11, 100);
		System.out.println(m1.get(e11));
		
		//m1.put("Tom", 100);
		
		e11 = "Vinayak";
		
	//	System.out.println(m1.get("Tom"));
		
		//m1.put("Vinayak", 200);
		m1.put(e11, 200);
		System.out.println(m1.get(e11));
		//System.out.println(m1.get("Vinayak"));
		System.out.println(m1.get("Tom"));
	}

}
