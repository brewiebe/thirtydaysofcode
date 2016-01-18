package day4operators;

public class Test {

	public static void main(String[] args) {
		Person per1 = new Person(45);
		per1.amIOld();
		per1.yearPasses();
		per1.amIOld();
		
		Person per2 = new Person(-115);
		per2.amIOld();
		
		Person per3 = new Person(13);
		per3.amIOld();
		per3.yearPasses();
		per3.amIOld();
	}

}
