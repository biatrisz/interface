package FunciPack;

public class Principal {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario (213, "beatrzz", "4324-432",32432, "rua luar");
		System.out.println( funcionario.calculaSalario(30,2));
		
		Horista horista = new Horista (213, "ju", "84392-3422", 49033, "rua ladrilhar");
		System.out.println(horista.calculaSalario(06,540));
		
		Jornada jornada = new Jornada(211, "bnri","940-4322", 4434, "rua dos boobs");
		System.out.println(jornada.calculaSalario(10, 10));
	}

}
