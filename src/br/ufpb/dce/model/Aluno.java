package br.ufpb.dce.model;

public class Aluno {
	
	private String nome;
	private String cpf;
	private String sobrenome;
	private String dataNascimento;
	private String matricula;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getId() {
		return 1;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}	
	
	public String getMatricula(){
		return matricula;
	}

	public int getVersao() {
		return 0;
	}

}
