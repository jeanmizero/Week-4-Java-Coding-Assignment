import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {
	public static void main(String[] args) {
		// 1
		List<String>employeeNames = new ArrayList<String>();
		// 4
		employeeNames.add("George");
		employeeNames.add("Lincoln");
		employeeNames.add("Adams");
		employeeNames.add("Balack");
		employeeNames.add("Franklin");
		System.out.println(employeeNames);
		// 2
		Set<Integer> ids = new HashSet<Integer>();
		// 4 part 2
		for(int i = 1; i <= employeeNames.size(); i++ ) {
			ids.add(i);	
			System.out.println(i);
		}
		// 3
		Map<Integer,String> employeeMap = new HashMap<Integer,String>();
		// 5
		int i = 0;
		for(Integer id:ids) {
			employeeMap.put(id,employeeNames.get(i));
			i++;
			}
		//6
		for (Integer key: employeeMap.keySet()) {
			System.out.println("(Key,value pair): " + key + " " + employeeMap.get(key));	
		}
		// 7
		StringBuilder idsBuilder = new StringBuilder();
		// 8
		for (Integer id : ids ) {
			idsBuilder.append(id + "-");	
		}
		// 9
		System.out.println(idsBuilder.toString());
		// 10
		StringBuilder namesBuilder = new StringBuilder();
		//11
		for (String name : employeeNames) {
			namesBuilder.append(name + " ");
		}
		//12
		System.out.println(namesBuilder.toString());
	}		
}
