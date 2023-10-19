package FunciPack;

public class Jornada extends Funcionario{

	public Jornada(long id, String nome, String telefone, int matrícula, String endereço) {
		super(id, nome, telefone, matrícula, endereço);
		
	}
	@Override
	public double calculaSalario(double salarioHora, double horasTrabalhadas){
		return salarioHora*horasTrabalhadas;
		
}
}