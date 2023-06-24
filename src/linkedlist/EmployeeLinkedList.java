package newproj.linkedlist;

public class EmployeeLinkedList {
	
	private EmployeeNode head;
	private int size;
	
	public void addToFirst(Employee emp) {
		EmployeeNode node = new EmployeeNode(emp);
		node.setNext(head);
		head = node;
		size++;
		
	}
//	public void insertAt(int i, Employee emp) {
//		EmployeeNode current = head;
//		EmployeeNode node = new EmployeeNode(emp);
//		if(i>getSize()) {
//			System.out.println("Array out of bound");
//		}
//		while(i>0) {
//			current = current.getNext();
//			i--;
//		}
//		current.setNext(node);
//		size++;
//	}
	public EmployeeNode removeFront() {
		if(head==null) return null;
		
		EmployeeNode node = head;
		head = node.getNext();
		node.setNext(null);
		size--;
		return node;
		
	}
	
	public boolean isEmpty() {
		if(head==null) return true;
		return false;
	}
	
	public int getSize() {
		return size;
	}
	
	public void show() {
		EmployeeNode current = head;
		System.out.print("Head ->");

		while(current!=null) {
		System.out.print(current);
		System.out.print(" ->");
		current = current.getNext();
		}
		System.out.println("null");
	}
}
