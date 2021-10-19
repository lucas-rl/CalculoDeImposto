package pessoa;

public abstract class Pessoa {
	
	//Attributes
	private String name;
	private double annualIncome;
	
	
	//Constructors
	public Pessoa(String name, double annualIncome) {
		super();
		this.name = name;
		this.annualIncome = annualIncome;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	//Methods
	public abstract double taxation();
	
}
