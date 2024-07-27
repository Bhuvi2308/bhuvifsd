package secondtask;

public class Person {
	int age =18;
	String name;
	
	Person(String name)
	{
		this.name=name;
	}
	  
	
	public void display ()
	{
		System.out.println("person age is:" + age );
		System.out.println("the person name is:" + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("bhuvana");
		person.display();
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
