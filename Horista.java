package FunciPack;

public class Horista extends Funcionario{

	public Horista(long id, String nome, String telefone, int matrícula, String endereço) {
		super(id, nome, telefone, matrícula, endereço);
	}
	@Override
	public double calculaSalario(double salarioHora, double horasTrabalhadas){
		return salarioHora*horasTrabalhadas;
	}

}
