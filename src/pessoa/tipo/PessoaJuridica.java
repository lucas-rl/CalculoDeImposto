package pessoa.tipo;

import pessoa.Pessoa;

public class PessoaJuridica extends Pessoa {
	//Atttributes
	private int numEmployees;

	//Constructors
	public PessoaJuridica(String name, double annualIncome, int numEmployees) {
		super(name, annualIncome);
		this.numEmployees = numEmployees;
	}

	//Getters and Setters
	public int getNumEmployees() {
		return numEmployees;
	}

	public void setNumEmployees(int numEmployees) {
		this.numEmployees = numEmployees;
	}

	//Methods
	public double taxation() {
		if (numEmployees <= 10) {
			return this.getAnnualIncome() * 0.16;
		}
		else {
			return this.getAnnualIncome() * 0.14;
		}
	}
	
}
