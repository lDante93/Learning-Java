package EmployeeAndManager;

public class Manager extends Employee {

private double bonus;
/*
 * @param n imiêi nazwisko pracownika
 * @param s pensja
 * @param year rok przyjêcia do pracy
 * @param month miesi¹c przyjêcia do pracy
 * @param day dzieñ przyjêcia do pracy
 */
		
		public Manager(String n, double s, int year, int month, int day)
		{
		super(n, s, year, month, day);
		}
		public double getSalary()
		{
			//return salary + bonus;
			double baseSalary = super.getSalary();
			return baseSalary+bonus;
		}
		
		
		public void setBonus(double b)
		{
			bonus = b;
		}
		
		
		
	}


