 
class Employee{
	private String firstName;
	private String lastName;
	private double salary;

	public Employee(String fName,String lName,double sal){
		if(fName != null) firstName=fName;
		if(lName != null) lastName=lName;
		if(sal > 0.0){
			salary=sal;
		}
		else{
			salary=0.0;
		}
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public double getSalary(){
		return salary;
	}
	public void setFirstName(String fName){
		if(fName != null) firstName = fName;
	}
	public void setLastName(String lName){
		if(lName != null) lastName = lName;
	}
	public void setSalary(double sal){
		if(sal > 0.0){
			salary = sal;
		}
		else{
			salary = 0.0;
		}
	}
	
}

class Emp{
	public static void main(String args[]){
		Employee obj1  = new Employee("Joy","Roy",10000.00);
		Employee obj2 = new Employee("Jiya","Cap",15000.00);
		System.out.println("FirstName: " + obj1.getFirstName());
		System.out.println("LastName: " + obj1.getLastName());
		System.out.println("Salary: " + obj1.getSalary()+"\n");
		System.out.println("FirstName: " + obj2.getFirstName());
		System.out.println("LastName: " + obj2.getLastName());
		System.out.println("Salary: " + obj2.getSalary());
		System.out.println();
		System.out.println("10% raise in salary...\n");
		obj1.setSalary((.1*obj1.getSalary())+obj1.getSalary());
		obj2.setSalary((.1*obj2.getSalary())+obj2.getSalary());
		System.out.println("FirstName: " + obj1.getFirstName());
		System.out.println("LastName: " + obj1.getLastName());
		System.out.println("Salary: " + obj1.getSalary()+"\n");
		System.out.println("FirstName: " + obj2.getFirstName());
		System.out.println("LastName: " + obj2.getLastName());
		System.out.println("Salary: " + obj2.getSalary());
	}
}



