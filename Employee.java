package hu.iit.uni.miskolc.oop;

public class Employee
{
	String name;
	int salary;
	
	public void RaiseSalary (int raise)
	{
		salary += raise;
	}
	
	public String Kiir ()
	{
		return "Név: " + name + ", fizetés: " + salary;
	}
	
	public boolean IsBiggerSalary (Employee otherEmployee)
	{
		if (salary > otherEmployee.salary)
		{
			return true;
		}
		return false;
	}
}