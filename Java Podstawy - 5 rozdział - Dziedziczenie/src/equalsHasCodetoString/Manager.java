package equalsHasCodetoString;

public class Manager extends Employee {

private double bonus;
/*
 * @param n imi�i nazwisko pracownika
 * @param s pensja
 * @param year rok przyj�cia do pracy
 * @param month miesi�c przyj�cia do pracy
 * @param day dzie� przyj�cia do pracy
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
		
		public boolean equal (Object otherObject)
		{
			if (!super.equals(otherObject)) return false;
			Manager other = (Manager) otherObject;
			return bonus == other.bonus;
		}
		
		public int hashCode()
		{
			return super.hashCode() + 17* new Double(bonus).hashCode();
		}
		public String toString()
		{
			return super.toString() + "[bonus=" + bonus + "]";
		}
		
		}
		
		
	


