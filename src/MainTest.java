
public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa("Vitor", "Nunes");
		System.out.println("O nome da pessoa e "+p1.getNomeCompleto());
		System.out.println(p1.getClass());	
		System.out.println();
		
		Funcionario f1 = new Funcionario ("Vitor", "Nunes", 23, 2000);
		System.out.println(f1.toString());
		System.out.println(f1.getClass());	
		System.out.println();
		
		Professor p2 = new Professor ("Vitor", "Nunes", 23, 2000);
		System.out.println(p2.toString());
		System.out.println(p2.getClass());	
		System.out.println();
		
		Funcionario f2 = new Funcionario ("Stella", "Braga", 24, 5000);
		System.out.println(f2.toString());
		System.out.println(f2.getClass());	
		System.out.println();
	
	}

}
