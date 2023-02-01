package newproj.linkedlist;

public class Runner {
	
	public static void main(String[] args) {
		EmployeeLinkedList list = new EmployeeLinkedList();
		System.out.println(list.isEmpty());
		list.addToFirst(new Employee("Raj", "kumar", 1));
		list.addToFirst(new Employee("Kumar", "Swamy", 2));
		list.addToFirst(new Employee("Ritesh", "kumar", 3));
		list.addToFirst(new Employee("nani", "Swamy", 12));
		
		System.out.println(list.isEmpty());
		System.out.println(list.getSize());
		list.show();
		list.removeFront();
		System.out.println(list.getSize());
		//list.insertAt(3, new Employee("kanchari", "swamy", 4));
		list.show();
	
	}
}
