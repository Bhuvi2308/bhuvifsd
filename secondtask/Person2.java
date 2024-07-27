package secondtask;

public class Person2 {
	int age;
	String name;
	
	Person2 (int age,String name)
	{
		
		this.age=age;
		this.name=name;
	}
	}

class Employee extends Person2
{
	public int empId;
	double empSalary;
	
	public Employee()
	{
		super(20,"bhuvi");
	}
	
	
	public Employee(int empId, double empSalary, int age, String name)
	
	{
		super(20,"bhuvi");
		this.empId=empId;
		this.empSalary=empSalary;
	}
	
	
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public double getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Employee employee = new Employee();
	//System.out.println(" person details :" + " " + empId+" " +age+" "+name+" "+salary);
	
	
}

	
	
	
	
}