package pessoa.tipo;

import pessoa.Pessoa;

public class PessoaFisica extends Pessoa {
	//Attributes
	private double healthExpenditure;

	public PessoaFisica(String name, double annualExpenditure, double healthExpenditure) {
		super(name, annualExpenditure);
		this.healthExpenditure = healthExpenditure;
	}
	
	
	//Getters and Setters
	public double getHealthExpenditure() {
		return healthExpenditure;
	}
	public void setHealthExpenditure(double healthExpenditure) {
		this.healthExpenditure = healthExpenditure;
	}


	//Methods
	public double taxation() { 
		if (this.getAnnualIncome() > 2000.00) {
			return this.getAnnualIncome() * 0.25 - this.getHealthExpenditure() * 0.5;
		}
		else {
			return this.getAnnualIncome() * 0.15 - this.getHealthExpenditure() * 0.5;
		}
	}
	
	
}
