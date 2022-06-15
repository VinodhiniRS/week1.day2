package week1.day2.assignments;

public class EmployeeDetails {
	public void printEmployeeName(String empName, int empId) 
	{
	System.out.println("The Employee Name is : "+empName+" and the Employee ID is :"+empId);
	}
	public void getEmployeeAddress(String empAddress) 
	{
		System.out.println("Address is:" +empAddress);
	}
	public void printEmployeeSalary(double empSalary)
	{
		System.out.println("Employee Salary is:"+empSalary);	
	}
	public void printEmployeeMobileNumber(long mobNum)
	{
		System.out.println("Mobile Number is:"+mobNum);	
	}
	
	public static void main(String[] args) {
		EmployeeDetails obj=new EmployeeDetails();
		obj.printEmployeeName("Vino", 12345);
		obj.getEmployeeAddress("Bangalore");
		obj.printEmployeeSalary(150000.234);
		obj.printEmployeeMobileNumber(97643124678L);
}

}
