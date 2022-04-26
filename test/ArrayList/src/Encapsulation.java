
public class Encapsulation 
{
	private int employee;
	private String employeename;
	private int employeesalary;
	
	public int getEmployee() {
		return employee;
	}
	public void setEmployee(int employee) {
		this.employee = employee;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public int getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(int employeesalary) {
		this.employeesalary = employeesalary;
	}
	public static void main(String[] args) 
	{
		Encapsulation env=new Encapsulation();
		env.setEmployee(34);
		env.setEmployeename("oohaa");
		env.setEmployeesalary(3000000);
System.out.println("Employee name is:" + env.getEmployee());
System.out.println("Employee namjjje is:" + env.getEmployeename());



		
	}
	
	

}
 