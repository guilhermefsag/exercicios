package entities;

public class Account {

	private int accNumber;
	private String name;
	private double deposit;

	public Account(int accNumber, String name) {
		this.accNumber = accNumber;
		this.name = name;
		
		
	}

	public Account(int accNumber, String name, double initialDeposit) {

		this.accNumber = accNumber;
		this.name = name;
		addDeposit(initialDeposit);
		
	}

	public int getNumber() {
		return accNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposit() {
		return deposit;
	}

	public double addDeposit(double deposit) {
		this.deposit += deposit;
		return this.deposit;
	}
	
	public double whitdraw(double whitdraw) {
	    this.deposit -= whitdraw;
		return this.deposit -= 5;
	}
	
@Override
	public String toString() {
		return "Account " + accNumber + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", deposit);
	}
}
