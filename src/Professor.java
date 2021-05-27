
public class Professor extends Funcionario{


	public Professor(String nome, String sobrenome, int matricula, double salario) {
		super(nome, sobrenome, matricula, salario);
		}
	
	@Override
	
	public double getPrimeiraParcela() {
		return salario;
	}
	@Override
	public double getSegundaParcela() {
		return salario=0;
	}
	
	@Override
	public int getClasse() {
		return 3;
	}

	
	
	
	
}
