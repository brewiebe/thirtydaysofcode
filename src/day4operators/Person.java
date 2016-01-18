package day4operators;

public class Person {
	private int age;
	
	public Person(int initAge){
		if(initAge<0){
			this.age=0;
			System.out.println("This person is not valid, setting age to 0.");
		}
		else {
			this.age=initAge;
		}
	}
	
	public void amIOld() {
		if(age<13){
			System.out.println("You are young.");
		}
		else if (age>=13 && age<18){
			System.out.println("You are a teenager.");
		}
		else{
			System.out.println("You are old.");
		}
	}
	
	public void yearPasses(){
		this.age++;
	}

}
