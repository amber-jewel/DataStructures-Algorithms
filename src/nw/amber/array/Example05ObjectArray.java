package nw.amber.array;

public class Example05ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonObjectArray arr = new PersonObjectArray(100);
		
		/*
		arr.insert(new Person("Miya", 12));
		arr.insert(new Person("Cyclos", 34));
		arr.insert(new Person("Bilder", 20));
		arr.insert(new Person("Test", 67));
		arr.insert(new Person("Hello", 10));
		
		arr.displayList();
		
		String name = "Miyat";
		if (arr.findByLinear(name) != null) {
			System.out.println("Found " + name);
		} else {
			System.out.println("Couldn't find " + name);
		}
		*/
		
		System.out.println("==================================");
		
		arr.insertWithSort(new Person("Miya", 12));
		arr.insertWithSort(new Person("Cyclos", 34));
		arr.insertWithSort(new Person("Bilder", 20));
		arr.insertWithSort(new Person("Test", 67));
		arr.insertWithSort(new Person("Hello", 10));
		arr.insertWithSort(new Person("AmongS", 89));
		
		arr.displayList();
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
		System.out.println("Name :" + name + " and Age :" + age);
	}
}

class PersonObjectArray {
	private Person[] arr;
	private int nElems;
	
	public PersonObjectArray(int size) {
		arr = new Person[size];
		nElems = 0;
	}
	
	public void insert(Person p) {
		arr[nElems] = p;
		nElems++;
	}
	
	public void insertWithSort(Person p) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (arr[i].getName().compareTo(p.getName()) > 0) {
				break;
			}
		}
		for (int k = nElems; k > i; k--) {
			arr[k] = arr[k - 1];
		}
		arr[i] = p;
		nElems++;
	}
	
	public Person findByLinear(String searchName) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (arr[i].getName().equals(searchName)) {
				break;
			}
		}
		
		if (i == nElems) {
			return null;
		} else {
			return arr[i];
		}
	}
	
	public void displayList() {
		for (int i = 0; i < nElems; i++) {
			arr[i].display();
		}
	}
}
