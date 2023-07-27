
public abstract  class Funcionario {
	private String name;
	private String document;
	private double salario;
	public Funcionario() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	// BONUS
	public abstract double getBonificacion();
}
