package thirdtask;

import java.util.Scanner;

public class Drivermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("Enter Employee ID:");
	        int empId = scanner.nextInt();
	        scanner.nextLine(); 
	        System.out.println("Enter Employee Name:");
	        String name = scanner.nextLine();
	        System.out.println("Enter Employee Salary:");
	        double salary = scanner.nextDouble();

	        Employee employee = new Employee(empId, name, salary);
	        System.out.println("Employee Information: " + employee);
	        System.out.println("overall one year tax for per month basis salary : " + employee.calcTax());

	       
	        System.out.println("Enter Product ID:");
	        int pid = scanner.nextInt();
	        System.out.println("Enter Product Price:");
	        double price = scanner.nextDouble();
	        System.out.println("Enter Product Quantity:");
	        int quantity = scanner.nextInt();

	        Product product = new Product(pid, price, quantity);
	        System.out.println("Product Information: " + product);
	        System.out.println("Sales Tax: " + product.calcTax());

	        
	    }
	}