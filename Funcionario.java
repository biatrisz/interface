package FunciPack;

public class Funcionario {
private long id;
private String nome;
private String telefone;
private int matrícula;
private String endereço;

public Funcionario(long id, String nome, String telefone, int matrícula, String endereço) {
	
	this.id = id;
	this.nome = nome;
	this.telefone = telefone;
	this.matrícula = matrícula;
	this.endereço = endereço;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}
public int getMatrícula() {
	return matrícula;
}
public void setMatrícula(int matrícula) {
	this.matrícula = matrícula;
}
public String getEndereço() {
	return endereço;
}
public void setEndereço(String endereço) {
	this.endereço = endereço;
}
public double calculaSalario(double salarioHora, double horasTrabalhadas){
	return salarioHora*horasTrabalhadas;
}

}

