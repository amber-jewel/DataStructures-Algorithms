package nw.amber.simplesorting;

public class Exampl04OjectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectArray obj = new ObjectArray(20);
		
		//obj.insert(new Person("Miya", 12));
		//obj.insert(new Person("Test", 56));
		//obj.insert(new Person("Hello", 89));
		obj.insert(new Person("Zyclos", 34));
		obj.insert(new Person("Cilong", 27));
		
		obj.displayList();
		obj.objectSortByInsertion();
		obj.displayList();
	}

}

class Person {
	private String name;
	private int age;
	
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	public void display() {
		System.out.println("Name: " + name + ", age: " + age);
	}
}

class ObjectArray {
	private Person[] arr;
	private int nElems;
	
	public ObjectArray(int size) {
		arr = new Person[size];
		nElems = 0;
	}
	
	public void insert(Person p) {
		arr[nElems] = p;
		nElems++;
	}
	
	public void objectSortByInsertion() {
		for (int out = 1; out < nElems; out++) {
			Person temp = arr[out];
			int in = out;
			while (in > 0 && arr[in - 1].getName().compareTo(temp.getName()) > 0) {
				arr[in] = arr[in - 1];
				in--;
			}
			arr[in] = temp;
		}
	}
	
	public void displayList() {
		for (int i = 0; i < nElems; i++) {
			arr[i].display();
		}
		System.out.println("");
	}
}
