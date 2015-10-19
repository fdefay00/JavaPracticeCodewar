package level1;

public class Person {
	
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person fab = new Person("fab");
		System.out.println(fab.greet("Pierrot"));
		
	}
		
	public Person(String personName){
			name = personName;
		}
	
	public String greet(String yourName) {
		return String.format("Hi %s, my name is %s", name, yourName);
	}
}
