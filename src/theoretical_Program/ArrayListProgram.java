package theoretical_Program;

import java.util.ArrayList;
import java.util.List;

class ArrayListProgram {
public static void main(String[] args) {
	List list=new ArrayList<>();
	list.add(10);
	list.add(20);
	list.add(50);
	list.add(10);
	
	System.out.println(list);
	System.out.println(list.get(2));
}
}
