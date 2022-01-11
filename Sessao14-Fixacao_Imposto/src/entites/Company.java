package entites;

public class Company extends TaxPayer{
	
	private int numberOfEmployees;
	
	public Company() {
	}

	public Company(String name, Double anuallncome, int numberOfEmployees) {
		super(name, anuallncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public double tax() {
		if (numberOfEmployees > 10) {
			return super.getAnuallncome() * 0.14 ;
		}
		else {
			return super.getAnuallncome() * 0.16;
		}
	}
}
