package hu.iit.uni.miskolc.oop;

public class main
{
	public static void main(String[] args)
	{
		Employee csaba = new Employee();
		
		csaba.name = "Novák Csaba";
		csaba.salary = 0;
		
		System.out.println(csaba.Kiir());
		csaba.RaiseSalary(500);
		System.out.println(csaba.Kiir());
		System.out.println();
		
	}
}
