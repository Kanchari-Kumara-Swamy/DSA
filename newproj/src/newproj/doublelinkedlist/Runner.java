package newproj.doublelinkedlist;

public class Runner {
	
	public static void main(String[] args) {
		EmployeeDoubleLinkedList list = new EmployeeDoubleLinkedList();
//		System.out.println(list.isEmpty());
		list.addToFirst(new Employee("Raj", "kumar", 1));
		list.addToFirst(new Employee("Kumar", "Swamy", 2));
		list.addToFirst(new Employee("Ritesh", "kumar", 3));
		list.addToTail(new Employee("nani", "Swamy", 12));
		
//		System.out.println(list.isEmpty());
		System.out.println(list.getSize());
		list.show();
//		list.removeFront();
		list.removeTail();
		System.out.println(list.getSize());
		list.show();
		
	}
}
