package ch07;

public class Person {
	String name;
	int age;
	
	public Person() {
		this("이름없음", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person getPerson() {
		return this;
	}
	public void showPerson() {
		System.out.println(name + " , " + age);
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.showPerson();
		System.out.println(person);
		Person person2 = person.getPerson();
		System.out.println(person2);
	}
}
