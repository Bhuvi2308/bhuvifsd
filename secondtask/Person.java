package secondtask;

public class Person {
    int age;
	String name;
	
	   public Person(String name, int i) {
		// TODO Auto-generated constructor stub
		if(i==18)
		{
		System.out.println("person age is:" + i );
		}
		else
		{
			System.out.println("person age should be 18");
		}
		
		System.out.println("the person name is:" + name);
		}

       public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("bhuvana",16);}


	public int getAge() {
		return age;}
	public void setAge(int age) {
		this.age = age;}
	                                 
	public String getName() {
		return name;}

    public void setName(String name) {
	  	this.name = name;}
}
	


