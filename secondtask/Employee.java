package secondtask;

public class Employee extends Personprg {
	
	int empId;
	double empSalary;
	
	Employee(String name,int age,int empId,double empSalary)
	
	{
		super(name,age);
		this.empId=empId;
		this.empSalary=empSalary;
	}

	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public void display()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(empId);
		System.out.println(empSalary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personprg person = new Personprg("bhuvi",28);
		person.display();
		
		Employee emp = new Employee("ammu",25,1111,18000);
		emp.display();
		
		Personprg p1 = new Employee("mohan",30,2222,20000);
		p1.display();

	}

}
