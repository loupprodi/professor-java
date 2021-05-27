
public class Funcionario extends Pessoa {
	
	
	private int matricula;
	protected double salario;

	
	public Funcionario(String nome, String sobrenome, int matricula, double salario) {
		super(nome, sobrenome);
		setMatricula(matricula);
		setSalario(salario);
	}

	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if(salario<0) {
			System.out.println("O salario nao pode ser negativo");
			salario=0;
		}
		else
			this.salario = salario;
	}
	
	public double getPrimeiraParcela() {
		return salario*0.6;
	}
	
	public double getSegundaParcela() {
		return salario*0.4;
	}
	
	public String toString() {
		return "O nome do funcionario e "+getNome()+" "+getSobrenome()+
			   "\nO salario do funcionario é "+getSalario()+" reais."+
			   "\n Na primeira parcela ele vai receber apenas 60% sendo "+getPrimeiraParcela()+" reais"+
			   " e a segunda parcela no valor de "+getSegundaParcela()+" reais";
	}
	
	@Override
	public int getClasse() {
		return 2;
	}

}
